package com.group1.BidZone_Onlinebiddingsystem.Auction;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuctionInterface extends Remote {
    String listItems() throws RemoteException;
    void bidOnItem(String itemId, double bidAmount) throws RemoteException;
    String manageAuction() throws RemoteException;
}
