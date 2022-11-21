package com.example.demojsontodb.service;

import com.example.demojsontodb.model.Users;
import com.example.demojsontodb.model.Users;
import com.example.demojsontodb.model.Users;
import com.example.demojsontodb.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Iterable<Users> list() {
        return userRepo.findAll();
    }

    public Users save(Users user) {
        return userRepo.save(user);
    }

    public void save(List<Users> users) {
        userRepo.saveAll(users);
    }
}
