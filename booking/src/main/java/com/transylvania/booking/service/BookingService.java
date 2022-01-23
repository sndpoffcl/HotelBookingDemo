package com.transylvania.booking.service;

import com.transylvania.booking.dto.BookingDTO;
import com.transylvania.booking.dto.LoginDTO;
import com.transylvania.booking.entity.Booking;
import com.transylvania.booking.entity.User;

public interface BookingService {
    Booking createBooking(BookingDTO bookingDTO) throws Exception;
    Booking cancelBooking(int bookingId);
    Booking updateBookingDetails(int bookingId, Booking booking);
}
