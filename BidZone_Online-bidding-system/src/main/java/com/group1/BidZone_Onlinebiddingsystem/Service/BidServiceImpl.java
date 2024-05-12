package com.group1.BidZone_Onlinebiddingsystem.Service;

import com.group1.BidZone_Onlinebiddingsystem.Model.Bid;
import com.group1.BidZone_Onlinebiddingsystem.Repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidServiceImpl implements BidService {

    @Autowired
    private BidRepository bidRepository;

    @Override
    public Bid saveBids(Bid bid) {
        return bidRepository.save(bid);
    }

}
