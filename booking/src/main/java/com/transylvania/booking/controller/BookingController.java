package com.transylvania.booking.controller;

import com.transylvania.booking.dto.BookingDTO;
import com.transylvania.booking.entity.Booking;
import com.transylvania.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping("/booking")
    public ResponseEntity createNewBooking(@RequestBody BookingDTO bookingDTO) throws Exception {
        Booking newBooking = bookingService.createBooking(bookingDTO);
        return ResponseEntity.ok(newBooking);
    }
}
