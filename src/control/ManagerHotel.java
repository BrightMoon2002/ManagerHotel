package control;

import model.Guest;
import model.Hotel;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ManagerHotel {
    private ArrayList<Hotel> managerHotel = new ArrayList<>();

    public ManagerHotel(ArrayList<Hotel> managerHotel) {
        this.managerHotel = managerHotel;
    }

    public void addNewGuest(Hotel newGuest) {
        managerHotel.add(newGuest);
    }

    public void removeGuest(int index) {
        managerHotel.remove(index);
    }

    public void editGuest(int index, Hotel newGuest) {
        managerHotel.set(index, newGuest);
    }
    public int checkIdentityCard(String identityCard) {
        int index = -1;
        for (int i = 0; i < managerHotel.size(); i++) {
            if (identityCard.equals(((Guest) managerHotel.get(i)).getIdentityCard())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public double checkFee(String identityCard) {
           return managerHotel.get(checkIdentityCard(identityCard)).getFeeHotel();
    }

    public Hotel creatNewGuest () {
        System.out.println("Enter the day Guest check in:");
        System.out.println("Enter the year of guest check in:");
        Scanner inputYear = new Scanner(System.in);
        int yearCheckin = inputYear.nextInt();
        System.out.println("Enter the month of guest check in:");
        Scanner inputMonth = new Scanner(System.in);
        int monthCheckin = inputMonth.nextInt();
        System.out.println("Enter the day of guest check in:");
        Scanner inputDay = new Scanner(System.in);
        int dayCheckin = inputDay.nextInt();
        Date day = new Date(yearCheckin, monthCheckin, dayCheckin);
        System.out.println("Enter the kind:");
        Scanner inputKind = new Scanner(System.in);
        String kind = inputKind.nextLine();
        System.out.println("Enter the name:");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        System.out.println("Enter the birthday:");
        System.out.println("Enter the year:");
        Scanner inputBirthday = new Scanner(System.in);
        int year = inputBirthday.nextInt();
        System.out.println("Enter the month");
        int month = inputBirthday.nextInt();
        System.out.println("Enter the day:");
        int dayOfBorn = inputBirthday.nextInt();
        LocalDate date = LocalDate.of(year, month, dayOfBorn);
        System.out.println("Enter the identity card:");
        Scanner inputCard = new Scanner(System.in);
        String identityCard = inputCard.nextLine();

        Hotel guest = new Guest(day, kind, name, date, identityCard);
        return guest;
    }

    public void menuHotel() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add new Guest");
            System.out.println("2. Edit new Guest");
            System.out.println("3. Remove new Guest");
            System.out.println("4. Check fee");
            System.out.println("5. Display list");
            System.out.println("0. Exit");
            Scanner inputChoose = new Scanner(System.in);
            int choose = inputChoose.nextInt();
            switch (choose) {
                case 1:
                    addNewGuest(creatNewGuest());
                    break;
                case 2:
                    System.out.println("Enter the index Guest who you want to edit");
                    Scanner inputIndex = new Scanner(System.in);
                    int index = inputIndex.nextInt();
                    editGuest(index, creatNewGuest());
                    break;
                case 3:
                    System.out.println("Enter the index Guest who you want to remove:");
                    Scanner inputIndex2 = new Scanner(System.in);
                    int index2 = inputIndex2.nextInt();
                    removeGuest(index2);
                    break;
                case 4:
                    System.out.println("Enter the identity Of Guest");
                    Scanner inputIdentity = new Scanner(System.in);
                    String identity = inputIdentity.nextLine();
                    if (checkIdentityCard(identity) == -1) {
                        System.out.println("No Guest has this identity");
                    } else {
                        System.out.println("This fee of guest: " + ((Guest)(managerHotel.get(checkIdentityCard(identity)))).getName() + " is: " + checkFee(identity));
                    }
                case 5:
                    showAllList();
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }

    }

    public void showAllList() {
        for (Hotel hotel: managerHotel
             ) {
            System.out.println(hotel);
        }
    }
}
