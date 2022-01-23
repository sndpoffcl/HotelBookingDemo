package com.transylvania.booking.entity;

import com.transylvania.booking.utils.BookingStatus;
import com.transylvania.booking.utils.RoomType;
import lombok.Data;

@Data
public class Room {
    private int id;
    private RoomType roomType;
    private int price;
    private Hotel hotel;
    private int occupancy;
    private BookingStatus bookingStatus;

    public Room() {
    }

    public Room(int id, RoomType roomType, int price, Hotel hotel, int occupancy) {
        this.id = id;
        this.roomType = roomType;
        this.price = price;
        this.hotel = hotel;
        this.occupancy = occupancy;
    }
}
