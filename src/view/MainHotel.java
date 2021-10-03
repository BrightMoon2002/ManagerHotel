package view;

import control.ManagerHotel;
import model.Guest;
import model.Hotel;
import sun.util.calendar.BaseCalendar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;


public class MainHotel {
    public static void main(String[] args) {
        System.out.println("Manager Hotel, Author is Nguyễn Hoàng Duy - C0821H1");

        ArrayList<Hotel> hotelList = new ArrayList<>();
        ManagerHotel managerHotel = new ManagerHotel(hotelList);
        managerHotel.menuHotel();
        managerHotel.showAllList();


//        LocalDate present = LocalDate.now();
//        System.out.println(present);
//        LocalDate dayCheckin = LocalDate.of(2002, 12, 3);
//        System.out.println(present.compareTo(dayCheckin));

//        Date present = new Date();
//        System.out.println(present);
//        Date inputDay = new Date(2002,12,12);
//        System.out.println(inputDay);



    }


}

