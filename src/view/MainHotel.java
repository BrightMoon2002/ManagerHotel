package view;

import control.ManagerHotel;
import model.Hotel;

import java.util.ArrayList;


public class MainHotel {
    public static void main(String[] args) {
        System.out.println("Manager Hotel, Author is Nguyễn Hoàng Duy - C0821H1");

        ArrayList<Hotel> hotelList = new ArrayList<>();
        ManagerHotel managerHotel = new ManagerHotel(hotelList);
        managerHotel.menuHotel();
        managerHotel.showAllList();
    }
}

