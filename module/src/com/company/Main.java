package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {
	    Address[] addresses = new Address[4];

        FileWriter writer = new FileWriter("filename.txt");



        Address address1 = new Address("Ukraine", "Romenska");
        Address address2 = new Address("Ukraine", "Toplsk");
        Address address3 = new Address("Ukraine", "Romenska");
        Address address4 = new Address("Ukraine", "local");

        addresses[0] = address1;
        addresses[1] = address2;
        addresses[2] = address3;
        addresses[3] = address4;


        Human[] humans = new Human[4];
        Human human1 = new Human("name1", "name2", "2009-04-15", address1);
        Human human2 = new Human("name1", "name3", "2008-06-15", address2);
        Human human3 = new Human("name2", "name4", "2012-04-15", address3);
        Human human4 = new Human("name3", "name5", "2011-04-15", address4);

        humans[0] = human1;
        humans[1] = human2;
        humans[2] = human3;
        humans[3] = human4;

        List<Human> foundSameStreet = Human.findSameStreet(humans, "Romenska");

        System.out.println("Leave on same street (Romenska): \n");
        writer.write("Leave on same street (Romenska): \n");
        for (Human human: foundSameStreet) {
            System.out.println(human.getLastName());
            writer.write("\n"+human.getLastName());
        }

        Human oldestHuman = Human.findOldest(humans);
        Human youngestHuman = Human.findYoungest(humans);

        System.out.println("\nOldest: " + oldestHuman.getLastName());
        writer.write("\nOldest: " + oldestHuman.getLastName());
        System.out.println("\nYoungest: " +youngestHuman.getLastName());
        writer.write("\nYoungest: " +youngestHuman.getLastName());

        List<Human> foundBetweenTwoDates = Human.findBetweenBirthday(humans, "2009-04-15", "2012-04-15");

        System.out.println("\nFound between birthday: ");
        writer.write("\nFound between birthday: ");
        for (Human human: foundBetweenTwoDates) {
            writer.write(human.getLastName());
            System.out.println(human.getLastName());
        }

        writer.close();

    }
}
