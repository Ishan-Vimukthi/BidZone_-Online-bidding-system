package com.group1.BidZone_Onlinebiddingsystem.Service;

import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import org.springframework.web.multipart.MultipartFile;

public interface ItemService {
    Item saveItem(Item item, MultipartFile itemImage);
}