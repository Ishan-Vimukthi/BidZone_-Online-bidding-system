package com.group1.BidZone_Onlinebiddingsystem.Service;

import com.group1.BidZone_Onlinebiddingsystem.Model.Users;

import java.util.Optional;

public interface UserService {
    Users saveUser(Users user);
    Optional<Users> findById(int id);
}
