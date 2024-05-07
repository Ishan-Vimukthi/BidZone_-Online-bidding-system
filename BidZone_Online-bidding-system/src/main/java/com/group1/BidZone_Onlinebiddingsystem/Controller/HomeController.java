package com.group1.BidZone_Onlinebiddingsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Impact Bootstrap Template - Index");
        // Add any other model attributes needed by your page
        return "index";
    }
}

