package com.transylvania.booking.repository;

import com.transylvania.booking.entity.Hotel;
import com.transylvania.booking.entity.Room;
import com.transylvania.booking.entity.User;
import com.transylvania.booking.utils.BookingStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomRepo {
    private static HashMap<Integer, Room> Rooms = new HashMap<>();

    public Room findById(int id){
        return Rooms.get(id);
    }

    public Room save(Room Room){
        Rooms.put(Room.getId(),Room);
        return Rooms.get(Room.getId());
    }

    public Room deleteById(Room Room){
        return Rooms.remove(Room.getId());
    }

    public List<Room> findAllRooms(){
        List<Room> RoomList = new ArrayList<>();
        for(Map.Entry<Integer,Room> h : Rooms.entrySet()){
            RoomList.add(h.getValue());
        }
        return RoomList;
    }

    public List<Room> findAllVacantRoomsInHotel(Hotel hotel){
        List<Room> RoomList = new ArrayList<>();
        for(Map.Entry<Integer,Room> h : Rooms.entrySet()){
            if(h.getValue().getBookingStatus().name().equals(BookingStatus.VACANT.name())
            && h.getValue().getHotel().getId() == hotel.getId())
                RoomList.add(h.getValue());
        }
        return RoomList;
    }
}
