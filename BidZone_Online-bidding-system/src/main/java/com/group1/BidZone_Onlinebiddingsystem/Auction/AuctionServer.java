package com.group1.BidZone_Onlinebiddingsystem.Auction;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AuctionServer {
    public static void main(String[] args) {
        try {
            AuctionInterface obj = new AuctionImpl();
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Auction", obj);
            System.out.println("Auction Server is ready.");
        } catch (Exception e) {
            System.out.println("Auction Server failed: " + e);
        }
    }
}

