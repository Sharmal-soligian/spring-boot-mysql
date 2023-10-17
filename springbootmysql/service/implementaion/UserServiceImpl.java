package com.springbootone.springbootmysql.service.implementaion;

import com.springbootone.springbootmysql.model.User;
import com.springbootone.springbootmysql.repo.UserRepo;
import com.springbootone.springbootmysql.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //repo use to communicate with the database
    UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public String createUser(User user) {
        userRepo.save(user);
        return "User created successfully";
    }

    @Override
    public String updateUser(User user) {
        userRepo.save(user);
        return "User updated successfully";
    }

    @Override
    public String deleteUser(String userId) {
        userRepo.deleteById(userId);
        return "Deleted successfully";
    }

    @Override
    public User getUser(String userId) {
        return userRepo.findById(userId).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
