package com.springsecutiry.fiap.modules.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecutiry.fiap.modules.user.entity.User;
import com.springsecutiry.fiap.modules.user.repository.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository repository;

     @GetMapping
    public ResponseEntity getAllUsers(){
        List<User> users = this.repository.findAll();

        return ResponseEntity.ok(users);
    }

}
