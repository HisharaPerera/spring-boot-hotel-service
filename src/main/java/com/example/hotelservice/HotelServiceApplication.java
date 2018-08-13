package com.example.hotelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HotelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelServiceApplication.class, args);
    }

    @RequestMapping(value = "/hotel/reservation", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String bookHotel(@RequestBody HotelReservationReq req){

        if (req.getCapacity() > 5){
            return "request failed";
        }else {
            return "request success";
        }
    }
}
