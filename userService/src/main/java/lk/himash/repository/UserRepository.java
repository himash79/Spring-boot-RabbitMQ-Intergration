package lk.himash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.himash.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
