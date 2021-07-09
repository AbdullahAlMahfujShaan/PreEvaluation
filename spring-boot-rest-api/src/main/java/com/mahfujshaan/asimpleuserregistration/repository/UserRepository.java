package com.mahfujshaan.asimpleuserregistration.repository;

import com.mahfujshaan.asimpleuserregistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    void deleteUserById(int reg_id);
    Optional<User> findUserById(int reg_id);
   void deleteAllUser();
   Optional<Object> findByName(String first_name);
}
