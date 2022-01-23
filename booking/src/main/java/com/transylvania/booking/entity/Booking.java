package com.transylvania.booking.entity;

import com.transylvania.booking.utils.BookingStatus;
import lombok.Data;

import java.util.List;

@Data
public class Booking {
    private int id;
    private int noOfDays;
    private int amount;
    private Hotel hotel;
    private User user;
    private BookingStatus status;
    private List<Room> rooms;

    public Booking() {
    }

    public Booking(int id, int noOfDays, int amount, Hotel hotel, User user, BookingStatus status) {
        this.id = id;
        this.noOfDays = noOfDays;
        this.amount = amount;
        this.hotel = hotel;
        this.user = user;
        this.status = status;
    }
}
