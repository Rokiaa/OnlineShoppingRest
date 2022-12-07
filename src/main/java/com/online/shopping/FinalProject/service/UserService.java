package com.online.shopping.FinalProject.service;

import com.online.shopping.FinalProject.dao.UserRepository;
import com.online.shopping.FinalProject.entity.Products;
import com.online.shopping.FinalProject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    private final UserRepository userRepo;

    @Autowired
    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }


    public List<User> getByEmail(String email){ return userRepo.getByEmail(email);}


    public User addUser(User users){
        return userRepo.save(users);
    }
    public List<User> findAllUsers(){
        return userRepo.findAll();
    }


}
