package com.group1.BidZone_Onlinebiddingsystem.Controller;

import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import com.group1.BidZone_Onlinebiddingsystem.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/addItem")
    public Item addItem(Item item) {
        return itemService.addItem(item);
    }

    // Other methods as needed
}



