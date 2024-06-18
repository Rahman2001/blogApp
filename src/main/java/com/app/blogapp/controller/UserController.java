package com.app.blogapp.controller;

import com.app.blogapp.domain.User;
import com.app.blogapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = this.userService.findAll();
        return users != null && !users.isEmpty() ?
                ResponseEntity.ok(users) : ResponseEntity.badRequest().build();
    }

    @PostMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User resp = this.userService.updateUser(user);
        return resp != null ? ResponseEntity.ok(resp) : ResponseEntity.notFound().build();
    }
}
