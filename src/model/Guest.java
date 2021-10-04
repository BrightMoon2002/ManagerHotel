package model;

import java.time.LocalDate;
import java.util.Date;

public class Guest extends Hotel {
    private String name;
    private LocalDate birthday;
    private String identityCard;

    public Guest(LocalDate day, String kind, String name, String identityCard) {
        super(day, kind);
        this.name = name;
        this.identityCard = identityCard;
    }


    public Guest(LocalDate day, String kind, String name, LocalDate birthday, String identityCard) {
        super(day, kind);
        this.name = name;
        this.birthday = birthday;
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    @Override
    public double getFeeHotel() {
        return super.getFeeHotel();
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", identityCard='" + identityCard + '\'' +
                "} " + super.getDay();
    }
}
