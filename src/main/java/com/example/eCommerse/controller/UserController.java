package com.example.eCommerse.controller;

import com.example.eCommerse.model.Address;
import com.example.eCommerse.model.User;
import com.example.eCommerse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping(value = "/addUser")
    public User createUser(@RequestBody User user) {
        List<Address> addressList = user.getAddress();
        for(Address address : addressList){
            address.setUser(user);
        }
        return userService.createUser(user);
    }

    @GetMapping(value = "/getUserById/{id}")
    public Optional<User> getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
