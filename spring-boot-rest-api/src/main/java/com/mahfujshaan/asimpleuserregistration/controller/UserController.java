package com.mahfujshaan.asimpleuserregistration.controller;


import com.mahfujshaan.asimpleuserregistration.entity.User;
import com.mahfujshaan.asimpleuserregistration.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/api/v1/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.findAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/api/v1/users/:id")
    public ResponseEntity<User> getUserById(@PathVariable("reg_id") int reg_id){
        User user = userService.findUserById(reg_id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


    @GetMapping("/api/v1/users/:name")
    public ResponseEntity<User> getUserByName(@PathVariable("first_name") String first_name){
        User user = userService.getUserByName(first_name);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/api/v1/users")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser,HttpStatus.CREATED);
    }


    @PutMapping("/api/v1/users/:id")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser,HttpStatus.OK);
    }

}
