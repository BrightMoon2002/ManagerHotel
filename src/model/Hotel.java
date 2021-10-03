package model;

import java.util.Date;

public class Hotel {
    public static final String TYPEA = "A";
    public static final String TYPEB = "B";
    public static final String TYPEC = "C";
    private Date day;
    private String kind;
    private double price;


    public Hotel(Date day, String kind) {
        this.day = day;
        this.kind = kind;
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
            case TYPEA:
                price = 400;
                break;
            case TYPEB:
                price = 300;
                break;
            case TYPEC:
                price = 200;
                break;
            default:
                price = 100;
                break;
        }
        return price;
    }

    public double setPrice(double price1, double price2, double price3) {
        switch (getKind()) {
            case TYPEA:
                this.price = price1;
                break;
            case TYPEB:
                this.price = price2;
                break;
            case TYPEC:
                this.price = price3;
                break;
        }
        return price;
    }

    public double getFeeHotel() {
        Date presentDay = new Date();
        Date dayCheckin = getDay();
        long day = presentDay.getTime() - dayCheckin.getTime();
        long a = day / (24 * 60 * 60 * 1000);
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
