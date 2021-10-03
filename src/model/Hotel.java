package model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Hotel {
    private Date day;
    private String kind;
    private double price;


    public Hotel(Date day, String kind) {
        this.day = day;
        this.kind = kind;
        this.price = price;
    }

    public Hotel(String kind, Date day, double price) {
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getPrice() {
       switch (getKind().toUpperCase()) {
           case "A":
               price = 400;
               break;
           case "B":
               price = 300;
               break;
           case "C":
               price = 200;
               break;
           default:
               price = 100;
               break;
       }
            return price;
    }

    public double setPrice(double price1, double price2, double price3) {
        if (getKind() == "A") {
            this.price = price1;
        } else if (getKind() == "B") {
            this.price = price2;
        } else if (getKind() == "C") {
            this.price = price3;
        }
        return price;
    }

    public double getFeeHotel() {
        Date presentDay = new Date();
        Date dayCheckin = getDay();
        long day = presentDay.getTime() - dayCheckin.getTime();
        long a = day/(24*60*60*1000);
        return a * getPrice();
        }

    @Override
    public String toString() {
        return "Hotel{" +
                "day=" + day +
                ", kind='" + kind + '\'' +
                ", price=" + price +
                '}';
    }
}
