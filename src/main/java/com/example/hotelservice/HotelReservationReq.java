package com.example.hotelservice;

public class HotelReservationReq {
    private final String fullName;
    private final String checkIn;
    private final String checkOut;
    private final String hotel;
    private final int roomNumber;
    private final int capacity;

    public HotelReservationReq() {
        fullName = "";
        checkIn = "";
        checkOut = "";
        hotel = "";
        roomNumber = 0;
        capacity = 0;
    }


    public HotelReservationReq(String fullName, String checkIn, String checkOut, String hotel, int roomNumber, int capacity) {
        this.fullName = fullName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.hotel = hotel;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public String getHotel() {
        return hotel;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }
}
