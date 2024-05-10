package com.group1.BidZone_Onlinebiddingsystem.Repository;

import com.group1.BidZone_Onlinebiddingsystem.Model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
