package com.transylvania.booking.entity;

import lombok.Data;

import java.util.List;

@Data
public class Hotel {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private List<Booking> bookings;
    private List<Room> rooms;
    private User hotelOwner;

    public Hotel() {
    }

    public Hotel(int id, String name, String address, String phoneNumber, List<Room> rooms, User hotelOwner) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.rooms = rooms;
        this.hotelOwner = hotelOwner;
    }
}
