package com.group1.BidZone_Onlinebiddingsystem.Controller;

import com.group1.BidZone_Onlinebiddingsystem.Model.Users;
import com.group1.BidZone_Onlinebiddingsystem.Repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(Users users, RedirectAttributes redirectAttributes, HttpSession session) {
        Users existingUser = userRepository.findByEmail(users.getEmail());
        if (existingUser != null && existingUser.getPassword().equals(users.getPassword())) {
            session.setAttribute("userId", existingUser.getUserID());
            session.setAttribute("username", existingUser.getUserName());
            return "redirect:/dashboard";
        } else {
            redirectAttributes.addFlashAttribute("error", "Invalid email or password.");
            return "redirect:/login";
        }
    }
}

