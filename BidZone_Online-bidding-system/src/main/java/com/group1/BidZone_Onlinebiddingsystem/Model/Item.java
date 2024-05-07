package com.group1.BidZone_Onlinebiddingsystem.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Item {
    @Id
    private Long itemId;
    private Long sellerId;
    private String name;
    private String description;
    private Double startPrice;
    private Date startTime;
    private Date endTime;

    // Getters and setters...
}

