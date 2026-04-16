package com.example.flc2.reg_form.repository;

import com.example.flc2.reg_form.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}