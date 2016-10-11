package com.example.controller;

import com.example.domain.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Brian on 10/7/2016.
 */

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @CrossOrigin
    @RequestMapping(value = "/user/{userName}")
    public User getUserByName(@PathVariable String userName){

        return userRepository.getUserByUserName(userName);
    }

    @CrossOrigin
    @RequestMapping(value = "/createUser",method = RequestMethod.POST)
    public User createUser(@RequestParam String userName){
        User user = new User();
        user.setUserName(userName);
        userRepository.save(user);
        return user;
    }

    @CrossOrigin
    @RequestMapping(value = "/allUsers",method = RequestMethod.GET)
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}

