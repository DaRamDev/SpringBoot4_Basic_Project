package com.rookies6.myspring4project.controller;

import com.rookies6.myspring4project.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/users")
public class UserRestController {
    private UserRepository userRepository;

    public UserRestController(UserRepository userRepository) {

        log.info("UserRepository 구현 클래스명 = {}", userRepository.getClass().getName());
        this.userRepository = userRepository;
    }
}