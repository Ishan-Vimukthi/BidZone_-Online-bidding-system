package com.group1.BidZone_Onlinebiddingsystem.Controller;

import org.springframework.ui.Model;
import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import com.group1.BidZone_Onlinebiddingsystem.Repository.UserRepository;
import com.group1.BidZone_Onlinebiddingsystem.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addItem")
    public String signup(Item item) {
        itemService.saveItem(item);
        return "redirect:/dashboard";
    }

    @GetMapping("/auctions")
    public String showAuctions(Model model) {
        List<Item> items = itemService.findAllItems();
        model.addAttribute("item", items);
        return "auction";
    }



}
