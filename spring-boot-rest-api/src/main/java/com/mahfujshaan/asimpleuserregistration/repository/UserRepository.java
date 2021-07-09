package com.mahfujshaan.asimpleuserregistration.repository;

import com.mahfujshaan.asimpleuserregistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    void deleteUserById(int reg_id);
    Optional<User> findUserById(int reg_id);
    void deleteAllUser();
    Optional<Object> findByName(String first_name);
}
