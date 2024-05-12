package com.group1.BidZone_Onlinebiddingsystem.Controller;

import com.group1.BidZone_Onlinebiddingsystem.Model.Bid;
import com.group1.BidZone_Onlinebiddingsystem.Service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BidController {

    @Autowired
    private BidService bidService;

    @PostMapping("/placeBid")
    public String signup(Bid bid) {
        bidService.saveBids(bid);
        return "redirect:/dashboard";
    }


}
