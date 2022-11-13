package lk.himash.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import lk.himash.config.MessageConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
@RequiredArgsConstructor
public class MessageAop {

	private final RabbitTemplate rabbitTemplate;
	
	@Pointcut("execution(* lk.himash.controller.*.*(..))")
	public void msgPointcut(){}
	
	  @Around("msgPointcut()")
	  public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
	      log.info("===================AOP AROUND INIT======================");
	      Object obj = joinPoint.proceed();
	      rabbitTemplate.convertAndSend(MessageConfig.EXCHANGE, MessageConfig.ROUTING_KEY, obj);
	      log.info("Signature : " + joinPoint.getSignature());
          log.info("Kind : " + joinPoint.getKind());
          log.info("SourceLocation : " + joinPoint.getSourceLocation());
          log.info("obj : " + obj);
	      log.info("===================AOP AROUND END======================");
	      return obj;
	  }
	
}
