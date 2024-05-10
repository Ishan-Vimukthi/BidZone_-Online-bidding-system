package com.group1.BidZone_Onlinebiddingsystem.Service;

import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import com.group1.BidZone_Onlinebiddingsystem.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    // Implement other methods as needed
}

