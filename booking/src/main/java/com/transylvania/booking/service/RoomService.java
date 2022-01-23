package com.transylvania.booking.service;

import com.transylvania.booking.dto.BookingDTO;
import com.transylvania.booking.entity.Booking;

public interface RoomService {
    Booking createBooking(BookingDTO bookingDTO);
    Booking cancelBooking(int bookingId);
    Booking updateBookingDetails(int bookingId, Booking booking);
}
