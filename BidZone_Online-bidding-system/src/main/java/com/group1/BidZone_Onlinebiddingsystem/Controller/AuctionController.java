package com.group1.BidZone_Onlinebiddingsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuctionController {

    @GetMapping("/auctions")
    public String auctions(Model model) {
        List<Auction> auctions = auctionService.getAllAuctions(); // Replace with your method to get all auctions
        model.addAttribute("auctions", auctions);
        return "auctions";
    }
}

