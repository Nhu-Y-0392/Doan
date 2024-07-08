package com.example.doan.Admin.Data;

public class Booking {
    private String idBooking;
    private String booking_date ;
    private String start_date;
    private String end_date;
    private double room_price;
    private float total_price = 0;
    private String idStaff = null;
    private String idCus = null;

    //getter and setter
    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public double getRoom_price() {
        return room_price;
    }

    public void setRoom_price(double room_price) {
        this.room_price = room_price;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    public String getIdCus() {
        return idCus;
    }

    public void setIdCus(String idCus) {
        this.idCus = idCus;
    }

    public Booking() {
        // Cần có constructor mặc định rỗng khi làm việc với Firebase
    }

    public Booking(String idBooking, String start_date, String end_date, double room_price, float total_price, String idStaff, String idCus) {
        this.idBooking = idBooking;
        this.start_date = start_date;
        this.end_date = end_date;
        this.room_price = room_price;
        this.total_price = total_price;
        this.idCus = idCus;
    }
}

