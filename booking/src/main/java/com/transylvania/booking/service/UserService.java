package com.transylvania.booking.service;

import com.transylvania.booking.dto.LoginDTO;
import com.transylvania.booking.entity.User;
import com.transylvania.booking.exception.InvalidCredentialException;

import java.util.List;

public interface UserService {
    User register(User user);
    User login(LoginDTO loginDTO) throws InvalidCredentialException;
    User updateUserDetails(User user);
    List<User> getAllUsers();
}
