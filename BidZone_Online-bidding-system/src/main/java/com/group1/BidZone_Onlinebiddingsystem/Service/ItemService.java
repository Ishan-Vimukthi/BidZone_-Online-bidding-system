package com.group1.BidZone_Onlinebiddingsystem.Service;

import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import java.util.List;
import java.util.Optional;

public interface ItemService {
    Item saveItem(Item item);
    List<Item> findAllItems();

}
