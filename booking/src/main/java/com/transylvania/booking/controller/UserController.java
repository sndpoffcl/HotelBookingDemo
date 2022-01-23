package com.transylvania.booking.controller;

import com.transylvania.booking.dto.LoginDTO;
import com.transylvania.booking.entity.User;
import com.transylvania.booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public ResponseEntity hello(){
        return ResponseEntity.ok("Hello world");
    }

    @PostMapping("/register")
    public ResponseEntity registration(@RequestBody User user){
        User user1  = userService.register(user);
        return ResponseEntity.ok(user1);
    }

    @PostMapping("/login")
    public ResponseEntity registration(@RequestBody LoginDTO loginDTO){
        User user1  = userService.login(loginDTO);
        return ResponseEntity.ok(user1);
    }

    @PostMapping("/users")
    public ResponseEntity getAllUsers(){
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
