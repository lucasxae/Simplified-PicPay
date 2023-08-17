package com.SimplePicPay.repositories;

import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User>findUserByDocument(String document);
    Optional<User>findUserById(Long id);

}
