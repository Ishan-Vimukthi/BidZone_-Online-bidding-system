package com.group1.BidZone_Onlinebiddingsystem.Repository;

import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}

