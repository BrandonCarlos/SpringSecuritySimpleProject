package com.telusko.springSecEx.repo;

import com.telusko.springSecEx.model.Student;
import com.telusko.springSecEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);

}
