package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Human {
    private String firstName;
    private String lastName;
    private Calendar birthday;
    private Address address;

    public Human(String firstName, String lastName, String birthday, Address address) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = format.parse(birthday);

        this.firstName = firstName;
        this.lastName = lastName;

        Calendar calendar =Calendar.getInstance();
        calendar.setTime(birthdayDate);

        this.birthday = calendar;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getAddress() {
        return address;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getLastName() {
        return lastName;
    }

    public static List<Human> findBetweenBirthday(Human[] humans, String startDate, String endDate) throws ParseException {
        List<Human> humansArray = new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date start = format.parse(startDate);
        Date end = format.parse(endDate);

        for (Human human : humans) {
            Calendar birthday = human.getBirthday();
            if (birthday.before(end) && birthday.after(start)) {
                humansArray.add(human);
            };
        }

        return humansArray;
    }

    public static Human findOldest(Human[] humans) {
        Human oldest = humans[0];
        for (Human human : humans) {
            Calendar date1 = oldest.getBirthday();
            Calendar date2 = human.getBirthday();
            if (date1.compareTo(date2) > 0) {
                oldest = human;
            }
        }
        return oldest;
    }

    public static Human findYoungest(Human[] humans) {
        Human oldest = humans[0];
        for (Human human : humans) {
            Calendar date1 = oldest.getBirthday();
            Calendar date2 = human.getBirthday();
            if (date2.compareTo(date1) > 0) {
                oldest = human;
            }
        }
        return oldest;
    }

    public static List<Human> findSameStreet(Human[] humans, String street) {
        List<Human> humansArray = new ArrayList<>();
        int i = 0;
        for (Human human : humans) {
            Address address = human.getAddress();
            if (address.getStreet().equals(street)) {
                humansArray.add(human);
            };
        }
        return humansArray;
    }

    public static Human findByLastName(Human[] humans, String lastName) {
        Human found = null;

        for (Human human : humans) {
            if (human.getLastName().equals(lastName)) return found = human;
        }

        return found;
    }
}
