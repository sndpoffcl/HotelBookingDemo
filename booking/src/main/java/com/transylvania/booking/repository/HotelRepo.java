package com.transylvania.booking.repository;

import com.transylvania.booking.entity.Booking;
import com.transylvania.booking.entity.Hotel;
import com.transylvania.booking.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class HotelRepo {

    private static HashMap<Integer, Hotel> hotels = new HashMap<>();

    public Hotel findById(int id){
        return hotels.get(id);
    }

    public Hotel save(Hotel hotel){
        hotels.put(hotel.getId(),hotel);
        return hotels.get(hotel.getId());
    }

    public Hotel deleteById(Hotel hotel){
        return hotels.remove(hotel.getId());
    }

    public List<Hotel> findAllhotels(){
        List<Hotel> hotelList = new ArrayList<>();
        for(Map.Entry<Integer,Hotel> h : hotels.entrySet()){
            hotelList.add(h.getValue());
        }
        return hotelList;
    }

    public List<Hotel> findAllHotelsByUser(User user){
        List<Hotel> hotelList = new ArrayList<>();
        for(Map.Entry<Integer,Hotel> h : hotels.entrySet()){
            if(h.getValue().getHotelOwner().getId()  == user.getId())
                hotelList.add(h.getValue());
        }
        return hotelList;
    }
}
