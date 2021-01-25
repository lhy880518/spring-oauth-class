package com.example.security1.repository;/*
 * Created by hylee@insterior.co.kr
 * Since 2021/01/25
 */

import com.example.security1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
}
