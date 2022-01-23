package com.transylvania.booking.service.impl;

import com.transylvania.booking.dto.LoginDTO;
import com.transylvania.booking.entity.User;
import com.transylvania.booking.exception.InvalidCredentialException;
import com.transylvania.booking.repository.UserRepo;
import com.transylvania.booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User register(User user) {
        return userRepo.save(user);
    }

    @Override
    public User login(LoginDTO loginDTO) throws InvalidCredentialException{
        List<User> users = userRepo.findAllUsers();
        for(User u : users){
            if(u.getEmailId().equals(loginDTO.getEmail())){
                if(!u.getPassword().equals(loginDTO.getPassword())){
                    throw new InvalidCredentialException("Invalid email id or password");
                }else{
                    return u;
                }
            }
        }
        throw new InvalidCredentialException("User does not exist");
    }

    @Override
    public User updateUserDetails(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAllUsers();
    }
}
