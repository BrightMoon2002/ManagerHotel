package view;

import control.ManagerHotel;
import model.Guest;
import model.Hotel;
import sun.util.calendar.BaseCalendar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class MainHotel {
    public static void main(String[] args) {
        System.out.println("Manager Hotel, Author is Nguyễn Hoàng Duy - C0821H1");

        ArrayList<Hotel> hotelList = new ArrayList<>();
        ManagerHotel managerHotel = new ManagerHotel(hotelList);
        managerHotel.menuHotel();
        managerHotel.showAllList();



    }


}

