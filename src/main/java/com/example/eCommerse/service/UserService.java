package com.example.eCommerse.service;

import com.example.eCommerse.model.User;
import com.example.eCommerse.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepository iUserRepository;

    public User createUser(User user) {
        return iUserRepository.save(user);
    }

    public Optional<User> getUserById(Integer id) {
        return iUserRepository.findById(id);
    }

    public List<User> getAllUsers() {
        List<User> users = (List<User>) iUserRepository.findAll();
        return users;
    }
}
