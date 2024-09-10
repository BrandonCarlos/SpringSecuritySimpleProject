package com.telusko.springSecEx.repo;

import com.telusko.springSecEx.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {
}
