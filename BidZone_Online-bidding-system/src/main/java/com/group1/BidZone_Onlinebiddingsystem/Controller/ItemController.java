package com.group1.BidZone_Onlinebiddingsystem.Controller;

import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import com.group1.BidZone_Onlinebiddingsystem.Service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class ItemController {
    private final ItemServiceImpl itemServiceimpl;

    @Autowired
    public ItemController(ItemServiceImpl itemServiceimpl) {
        this.itemServiceimpl = itemServiceimpl;
    }

    @PostMapping("/addItem")
    public String addItem(@RequestParam("itemImage") MultipartFile itemImage, Item item) {
        try {
            item.setItemImage(itemImage.getBytes());
        } catch (IOException e) {
            // handle exception
        }
        itemServiceimpl.saveItem(item);
        return "redirect:/dashboard";
    }
}

