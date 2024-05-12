package com.group1.BidZone_Onlinebiddingsystem.Auction;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AuctionClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            AuctionInterface obj = (AuctionInterface) registry.lookup("Auction");
            System.out.println(obj.listItems());
        } catch (Exception e) {
            System.out.println("Auction Client exception: " + e);
        }
    }
}
