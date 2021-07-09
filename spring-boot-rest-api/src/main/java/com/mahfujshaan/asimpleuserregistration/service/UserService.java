package com.mahfujshaan.asimpleuserregistration.service;


import com.mahfujshaan.asimpleuserregistration.entity.User;
import com.mahfujshaan.asimpleuserregistration.exception.UserNotFoundException;
import com.mahfujshaan.asimpleuserregistration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    //InsertData
    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    //UpdateData
    public User updateUser(User user){
        return userRepository.save(user);
    }
    //DeleteData
    public void deleteUser(int id){
        userRepository.deleteUserById(id);
    }

    //DeleteAllData
    //public String deleteAllUser(){
        //userRepository.deleteAllUser();
       // return "All Users Removed";
   // }
    //
    public User findUserById(int id){
        return userRepository.findUserById(id).orElseThrow(()->new UserNotFoundException("User ID" +id+ "not found!!"));
    }
//
//
//    //GetUserByName
    //public User findUserByName(String firstname){
    //return userRepository.findUserByName(firstname).orElseThrow(()->new UserNotFoundException("Username" +firstname+ "not found!!"));
    // }
//
//
}
