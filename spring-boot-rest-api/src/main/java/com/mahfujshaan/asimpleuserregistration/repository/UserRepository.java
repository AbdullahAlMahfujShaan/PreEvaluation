package com.mahfujshaan.asimpleuserregistration.repository;

import com.mahfujshaan.asimpleuserregistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
