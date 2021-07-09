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

        //user.setUserReg_id();
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
    public String deleteUser(int reg_id){
        userRepository.deleteUserById(reg_id);
        return "User Removed" +reg_id;
    }

    //DeleteAllData
   public String deleteAllUser(){
        userRepository.deleteAllUser();
       return "All Users Removed";
    }

    public User findUserById(int reg_id){
        return userRepository.findUserById(reg_id)
                .orElseThrow(()->new UserNotFoundException("User ID" +reg_id+ "not found!!"));
    }


    //GetUserByName
    public User getUserByName(String first_name){
        return (User) userRepository.findByName(first_name).orElseThrow(()->new UserNotFoundException("Username" +first_name+ "not found!!"));
    }


}
