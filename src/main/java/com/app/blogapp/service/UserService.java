package com.app.blogapp.service;

import com.app.blogapp.domain.User;
import com.app.blogapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public User updateUser(User user) {
        User resp = this.userRepo.findByIdAndEmail(user.getId(), user.getEmail());
        return resp != null ? this.userRepo.save(user) : null;
    }

}
