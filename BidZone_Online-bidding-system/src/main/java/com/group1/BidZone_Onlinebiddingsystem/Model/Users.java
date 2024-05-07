package com.group1.BidZone_Onlinebiddingsystem.Model;
import jakarta.persistence.*;
@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int UserId;
    private String userName;
    private String password;
    private String email;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
