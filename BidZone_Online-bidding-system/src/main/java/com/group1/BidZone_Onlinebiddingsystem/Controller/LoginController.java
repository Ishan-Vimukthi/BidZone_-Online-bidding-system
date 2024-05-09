package com.group1.BidZone_Onlinebiddingsystem.Controller;

import com.group1.BidZone_Onlinebiddingsystem.Model.Users;
import com.group1.BidZone_Onlinebiddingsystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(Users users) {
        Users existingUser = userRepository.findByEmail(users.getEmail());
        if (existingUser != null && existingUser.getPassword().equals(users.getPassword())) {
            return "redirect:/";
        } else {
            return "redirect:/login?error";
        }
    }
}

