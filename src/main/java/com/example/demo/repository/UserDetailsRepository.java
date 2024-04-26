package com.example.demo.repository;

import com.example.demo.entity.UserDetailsBo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface UserDetailsRepository extends JpaRepository<UserDetailsBo, Serializable> {
}
