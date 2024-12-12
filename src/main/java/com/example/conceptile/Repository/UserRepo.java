package com.example.conceptile.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.conceptile.Models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
