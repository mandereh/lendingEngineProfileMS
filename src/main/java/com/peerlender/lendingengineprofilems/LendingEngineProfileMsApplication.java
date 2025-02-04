package com.peerlender.lendingengineprofilems;

import com.peerlender.lendingengineprofilems.domain.model.User;
import com.peerlender.lendingengineprofilems.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendingEngineProfileMsApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(LendingEngineProfileMsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User());
    }
}
