package com.group1.BidZone_Onlinebiddingsystem.Controller;


import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import com.group1.BidZone_Onlinebiddingsystem.Service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class ItemController {
    private final ItemServiceImpl itemServiceimpl;

    @Autowired
    public ItemController(ItemServiceImpl itemServiceimpl) {
        this.itemServiceimpl = itemServiceimpl;
    }

    @PostMapping("/addItem")
    public String addItem(@RequestParam("itemImage") MultipartFile itemImage, @ModelAttribute Item item, HttpSession session) {
        try {
            item.setItemImage(itemImage.getBytes());
        } catch (IOException e) {
            // handle exception
            System.out.println("Error occurred while converting image to bytes: " + e.getMessage());
        }
        // Get user ID from session and set it as the seller ID
        Long userId = (Long) session.getAttribute("userId");
        item.setSellerId(userId.intValue());
        itemServiceimpl.saveItem(item);
        return "redirect:/dashboard";
    }

    @GetMapping("/auctions")
    public String showAuctions(Model model) {
        List<Item> items = itemServiceimpl.getAllItems();
        model.addAttribute("items", items);
        return "/auctions";
    }

}
