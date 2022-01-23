package com.transylvania.booking.entity;

import com.transylvania.booking.utils.Usertype;
import lombok.Data;

import java.util.List;

@Data
public class User {
    private int id;
    private String name;
    private String emailId;
    private String password;
    private String phoneNumber;
    private String address;
    private Usertype userType;
    private List<Booking> bookings;
    private List<Hotel> hotels;

    public User() {
    }

    public User(int id, String name, String emailId, String password, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
