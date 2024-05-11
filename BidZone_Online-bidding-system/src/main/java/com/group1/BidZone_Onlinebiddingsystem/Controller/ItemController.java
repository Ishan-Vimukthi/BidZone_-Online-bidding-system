package com.group1.BidZone_Onlinebiddingsystem.Controller;

import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import com.group1.BidZone_Onlinebiddingsystem.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/addItem")
    public ResponseEntity<String> addItem(@ModelAttribute Item item, @RequestParam("itemImage") MultipartFile itemImage) throws IOException {
        try {
            // Handle uploaded image (if applicable)
            if (itemImage != null && !itemImage.isEmpty()) {
                byte[] imageBytes = itemImage.getBytes();
                item.setItemImage(imageBytes);
            }

            // Call the service method to save the item (including image)
            itemService.saveItem(item);

            return new ResponseEntity<>("Item added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception for debugging
            return new ResponseEntity<>("Error adding item: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Additional methods for retrieving, updating, or deleting items (optional)
}
