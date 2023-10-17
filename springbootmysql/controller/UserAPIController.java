package com.springbootone.springbootmysql.controller;

import com.springbootone.springbootmysql.model.User;
import com.springbootone.springbootmysql.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserAPIController {
    UserService userService;

    public UserAPIController(UserService userService) {
        this.userService = userService;
    }


    // Get all users
    @GetMapping()
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    // Get user by id
    @GetMapping("{userId}")
    public User getUser(@PathVariable("userId") String userId) {
        return userService.getUser(userId);
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "User created successfully";
    }

    @PutMapping
    public String updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return "User updated successfully";
    }

    @DeleteMapping("{userId}")
    public String deleteUser(@PathVariable("userId") String userId) {
        userService.deleteUser(userId);
        return "User deleted successfully";
    }
}
