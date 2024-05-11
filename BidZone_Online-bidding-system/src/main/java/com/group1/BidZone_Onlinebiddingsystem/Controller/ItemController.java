package com.group1.BidZone_Onlinebiddingsystem.Controller;

import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import com.group1.BidZone_Onlinebiddingsystem.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;



    // Additional methods for retrieving, updating, or deleting items (optional)


    @PostMapping(value = "/addItem", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Item> addItem(
            @RequestParam("Name") String name,
            @RequestParam("Description") String description,
            @RequestParam("StartPrice") double startPrice,
            @RequestParam("StartTime") LocalDateTime startTime,
            @RequestParam("EndTime") LocalDateTime endTime,
            @RequestParam("SellerID") int sellerId,
            @RequestParam("ItemImage") MultipartFile itemImage) {
        try {
            Item item = new Item();

            item.setName(name);
            item.setDescription(description);
            item.setStartPrice(startPrice);
            item.setStartTime(startTime);
            item.setEndTime(endTime);
            item.setSellerId(sellerId);

            item.setItemImage(itemImage.getBytes());

            Item savedItem = itemService.saveItem(item, itemImage);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedItem);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
  }
}


}