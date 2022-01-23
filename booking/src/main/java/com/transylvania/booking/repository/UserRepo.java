package com.transylvania.booking.repository;

import com.transylvania.booking.entity.User;
import com.transylvania.booking.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepo {

    private static HashMap<Integer, User> Users = new HashMap<>();

    public User findById(int id){
        return Users.get(id);
    }

    public User save(User User){
        Users.put(User.getId(),User);
        return Users.get(User.getId());
    }

    public User deleteById(User User){
        return Users.remove(User.getId());
    }

    public List<User> findAllUsers(){
        List<User> UserList = new ArrayList<>();
        for(Map.Entry<Integer,User> h : Users.entrySet()){
            UserList.add(h.getValue());
        }
        return UserList;
    }
}
