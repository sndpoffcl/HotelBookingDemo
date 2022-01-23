package com.transylvania.booking.repository;

import com.transylvania.booking.entity.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookingRepo {

    private static HashMap<Integer, Booking> bookings = new HashMap<>();

    public Booking findById(int id){
        return bookings.get(id);
    }

    public Booking save(Booking booking){
        bookings.put(booking.getId(),booking);
        return bookings.get(booking.getId());
    }

    public Booking deleteById(Booking booking){
        return bookings.remove(booking.getId());
    }

    public List<Booking> findAllBookings(){
        List<Booking> bookingList = new ArrayList<>();
        for(Map.Entry<Integer,Booking> b : bookings.entrySet()){
            bookingList.add(b.getValue());
        }
        return bookingList;
    }

    public List<Booking> findAllBookingsByCustomer(User user){
        List<Booking> bookingList = new ArrayList<>();
        for(Map.Entry<Integer,Booking> b : bookings.entrySet()){
            if(b.getValue().getUser().getId() == user.getId())
                bookingList.add(b.getValue());
        }
        return bookingList;
    }

    public List<Booking> findAllBookingsByHotel(Hotel hotel){
        List<Booking> bookingList = new ArrayList<>();
        for(Map.Entry<Integer,Booking> b : bookings.entrySet()){
            if(b.getValue().getHotel().getId() == hotel.getId())
                bookingList.add(b.getValue());
        }
        return bookingList;
    }
}
