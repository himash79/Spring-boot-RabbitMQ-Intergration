package lk.himash.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import lk.himash.config.MessageConfig;
import lk.himash.entity.User;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserMsgConsumer {

    @RabbitListener(queues = MessageConfig.QUEUE)
    public void consumeMessageFromQueue(Object user) {
        log.info("Message recieved from queue : " + user);
    }
	
}
