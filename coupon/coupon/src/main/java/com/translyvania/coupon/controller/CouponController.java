package com.translyvania.coupon.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponController {

    @GetMapping("/coupon/{code}")
    public ResponseEntity validateCoupon(@PathVariable("code") String code){
        if(code.length() > 8){
            return ResponseEntity.ok(true);
        }else{
            return ResponseEntity.ok(false);
        }
    }
}
