package com.peerlender.lendingengineprofilems.application;

import com.peerlender.lendingengineprofilems.domain.model.User;
import com.peerlender.lendingengineprofilems.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    private final UserRepository userRepository;
    @Autowired
    public ProfileController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/users")
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public void newUser(@RequestBody final User user){
        userRepository.save(user);
    }
    @PutMapping("/user")
    public void updateUser(@RequestBody final User user){
        userRepository.save(user);
    }


}
