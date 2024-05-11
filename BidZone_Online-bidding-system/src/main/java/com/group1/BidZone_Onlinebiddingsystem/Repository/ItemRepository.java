package com.group1.BidZone_Onlinebiddingsystem.Repository;

import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findBySellerId(int sellerId);

}