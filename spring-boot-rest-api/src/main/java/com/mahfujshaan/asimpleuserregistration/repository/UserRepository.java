package com.mahfujshaan.asimpleuserregistration.repository;

import com.mahfujshaan.asimpleuserregistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    void deleteUserById(int id);
    Optional<User> findUserById(int id);
   //void deleteAllUser();
    //Optional<User> findUserByName(String firstname);
}