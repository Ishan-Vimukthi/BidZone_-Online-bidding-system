package com.group1.BidZone_Onlinebiddingsystem.Repository;

import com.group1.BidZone_Onlinebiddingsystem.Model.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends JpaRepository<Bid, Integer> {
}