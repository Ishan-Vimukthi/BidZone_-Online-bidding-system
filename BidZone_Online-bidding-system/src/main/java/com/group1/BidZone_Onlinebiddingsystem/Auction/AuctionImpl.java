package com.group1.BidZone_Onlinebiddingsystem.Auction;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AuctionImpl extends UnicastRemoteObject implements AuctionInterface {
    // Constructor and any needed instance variables here

    public AuctionImpl() throws RemoteException {
        super();
    }

    public String listItems() throws RemoteException {
        // Implementation here
        return "";
    }

    public void bidOnItem(String itemId, double bidAmount) throws RemoteException {
        // Implementation here
    }

    public String manageAuction() throws RemoteException {
        // Implementation here
        return "";
    }
}
