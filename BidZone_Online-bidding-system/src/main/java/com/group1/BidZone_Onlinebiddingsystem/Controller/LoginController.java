package com.group1.BidZone_Onlinebiddingsystem.Controller;

import com.group1.BidZone_Onlinebiddingsystem.Model.Users;
import com.group1.BidZone_Onlinebiddingsystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(Users users, RedirectAttributes redirectAttributes) {
        Users existingUser = userRepository.findByEmail(users.getEmail());
        if (existingUser != null && existingUser.getPassword().equals(users.getPassword())) {
            return "redirect:/auction";
        } else {
            redirectAttributes.addFlashAttribute("error", "Invalid email or password.");
            return "redirect:/login";
        }
    }
}

