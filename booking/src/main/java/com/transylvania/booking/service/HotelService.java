package com.transylvania.booking.service;

import com.transylvania.booking.dto.HotelDTO;
import com.transylvania.booking.entity.Hotel;

public interface HotelService {
    Hotel createHotel(HotelDTO HotelDTO);
    Hotel deleteHotel(int HotelId);
    Hotel updateHotelDetails(int HotelId, Hotel hotel);
}
