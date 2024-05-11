package com.group1.BidZone_Onlinebiddingsystem.Service;

import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import com.group1.BidZone_Onlinebiddingsystem.Repository.ItemRepository;
import com.group1.BidZone_Onlinebiddingsystem.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item saveItem(Item item, MultipartFile itemImage) {
        return itemRepository.save(item); // Persists item to database
}
}