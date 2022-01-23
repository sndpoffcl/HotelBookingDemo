package com.transylvania.booking.dto;

import lombok.Data;

@Data
public class BookingDTO {
    private int hotelId;
    private int noOfRooms;
    private int noOfOccupants;
    private int userId;
    private String coupon;
    private int noOfDays;

    public BookingDTO() {
    }

    public BookingDTO(int hotelId, int noOfRooms, int noOfOccupants, int userId) {
        this.hotelId = hotelId;
        this.noOfRooms = noOfRooms;
        this.noOfOccupants = noOfOccupants;
        this.userId = userId;
    }
}
