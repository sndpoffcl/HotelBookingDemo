package com.transylvania.booking.service.impl;

import com.transylvania.booking.dto.BookingDTO;
import com.transylvania.booking.entity.Booking;
import com.transylvania.booking.repository.BookingRepo;
import com.transylvania.booking.repository.HotelRepo;
import com.transylvania.booking.repository.UserRepo;
import com.transylvania.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    HotelRepo hotelRepo;

    @Autowired
    UserRepo userRepo;

    private static int bookingCounter;

    static{
        bookingCounter = 1;
    }

    @Override
    public Booking createBooking(BookingDTO bookingDTO) throws Exception{
        Booking booking = new Booking();
        booking.setId(bookingCounter++);
        //booking.setHotel(hotelRepo.findById(bookingDTO.getHotelId()));
        booking.setNoOfDays(bookingDTO.getNoOfDays());
        booking.setUser(userRepo.findById(bookingDTO.getUserId()));
        //validate the coupon
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8091/coupon/" + bookingDTO.getCoupon();
        ResponseEntity<Boolean> response = restTemplate.getForEntity(url,Boolean.class);
        if(response.getBody().equals(true)){
            Booking newBooking = bookingRepo.save(booking);
            return newBooking;
        }else{
            throw new Exception("Invalid Coupon code");
        }
    }

    @Override
    public Booking cancelBooking(int bookingId) {
        return null;
    }

    @Override
    public Booking updateBookingDetails(int bookingId, Booking booking) {
        return null;
    }
}
