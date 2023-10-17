package com.springbootone.springbootmysql.repo;

import com.springbootone.springbootmysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

}
