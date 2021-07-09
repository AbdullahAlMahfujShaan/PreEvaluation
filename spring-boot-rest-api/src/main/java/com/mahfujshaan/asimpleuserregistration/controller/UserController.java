package com.mahfujshaan.asimpleuserregistration.controller;


import com.mahfujshaan.asimpleuserregistration.entity.User;
import com.mahfujshaan.asimpleuserregistration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
//
   @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
   }
//
//
 @GetMapping("/api/v1/users")
    public ResponseEntity<List<User>> getAllUsers(){
       List<User> users = userService.findAllUser();
       return new ResponseEntity<>(users, HttpStatus.OK);
   }

    @GetMapping("/api/v1/users/:id")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id){
        User user = userService.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


//    @GetMapping("/api/v1/users/:name")
//    public ResponseEntity<User> getUserByName(@PathVariable("firstname") String firstname){
//        User user = userService.getUserByName(firstname);
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }
//
    @PostMapping("/api/v1/users")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newUser = userService.addUser(user);
       return new ResponseEntity<>(newUser,HttpStatus.CREATED);
    }
//
//
    @PutMapping("/api/v1/users/:id")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser,HttpStatus.OK);
    }
//
//
    @DeleteMapping("/api/v1/users/:id")
   public ResponseEntity<?> deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
//
//    @DeleteMapping("/api/v1/users/")
//   public String deleteAllUser(){
//
//       return userService.deleteAllUser();
//   }
//
//
}
