import java.awt.*;
import java.util.*;
import java.io.*;

public class book {
    /* while booking they can request things such as projector, pens, paper

     */
    private static ArrayList<meetingRoom1> meetingRoom1 = new ArrayList<>();
    private static ArrayList<meetingRoom2> meetingRoom2 = new ArrayList<>();
    private static ArrayList<meetingRoom3> meetingRoom3 = new ArrayList<>();
    private static ArrayList<meettingRoom4> meettingRoom4 = new ArrayList<>();
    private static ArrayList<meetingRoom5> meetingRoom5 = new ArrayList<>();
    private static ArrayList<Menu> menuList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        meetingRoom1 = fileHandling.readFile();

        meetingRoom2 = fileHandling.readFile();

        meettingRoom4 = fileHandling.readFile();

        meetingRoom3 = fileHandling.readFile();

        meetingRoom5 = fileHandling.readFile();

        menuList = fileHandling.readFile();

        System.out.println("hello welcome to our meeting room renting out place." );
        System.out.println(  "press 1 if you would like to book a meeting room." );
        System.out.println("press 2 if you would like to amend a booking." );
        System.out.println("press 3 if you are a member of staff and wish to change anything.");
        System.out.println("press 0 if you would like to just exit.");
        int MenuChoice = input.nextInt();
        switch (MenuChoice) {
            case 1:
                System.out.println("do you need disabled access for your meeting? Y or N");
                String disabledAccess = input.next();
                if (disabledAccess.equals("Y")) {
                    System.out.println("Im sorry as only one of our meeting rooms has disabled access you are going" +
                            " to have to have room 4 which has the capacity of up to 15 people.");
                    System.out.println("for booking the slots are 9:00-9:30-10:00 or 11:00-11:30-12:00 or 1:00-1:30-2:00 or 3:00-3:30-4:00 or 5:00-5:30-6:00. ");
                    System.out.println("you can book more than one meeting slot at one time. each meeting slot will cost you £20.00 with it being an extra £40.00 to book another slot at that one time.");

                    System.out.println(meetingRoom4);
                } else {
                    System.out.println("how many people are in your meeting? 1 - 50");
                    int NumberPeople = input.nextInt();
                    if (NumberPeople <= 2) {
                        System.out.println("You will be in room either room 1 or room 2" +
                                " depending on the time you would like to book for.");
                        System.out.println("how long is your meeting going to be? if it is more" +
                                " than 30 minutes you have to book more than one time slot. " +
                                "booking an additional timeslot would mean your time slot would be 2:00. ");
                        System.out.println("you can see the vavcancies in meeting room 1");
                        for (int i = 0; i < meetingRoom1.size(); i++) {
                            System.out.println(meetingRoom1.get(i).toString());
                            System.out.println("here you can see the vacancies in meeting rokom 2");
                            for (int i = 0; i < meetingRoom2.size(); i++) {
                                System.out.println(meetingRoom2.get(i).toString());
                                System.out.println(" the times slots you can book differ between room 1 and 2 room one is a room fit for two room two fits 4 people.");
                                System.out.println("time slots for rrom one are 9:00-9:30 or  10:30-11:30 or 12:30-1:30 or 2:30-3:30 or 4:30-5:30");
                                System.out.println("for this room it is £10 pounds for one time sloteach time slot being half an hour but more than one time slot will push £20 more pounds on that for a second one.");
                                System.out.println("time slots for room two are 9:30-10:00 or 11:00-11:30 or 12:30-1:00 or 2:00-2:30 or 3:30-4:00 or 5:00-5:30");
                                System.out.println("with on time slot being £15 and adding another more time slots would make it £45 ");
                                System.out.println(meetingRoom2);
                                System.out.println(meetingRoom1);
                    }
                    if (NumberPeople > 2 && NumberPeople <= 4) {
                        System.out.println("You will either be in room 2 or room 3 depending on" +
                                " what time you wish to book and our vacancies.");
                        for (int i = 0; i < meetingRoom2.size(); i++) {
                            System.out.println(meetingRoom2.get(i).toString());
                            System.out.println("here you can see the vacancies in meeting rokom 2");
                            for (int i = 0; i < meetingRoom3.size(); i++) {
                                System.out.println(meetingRoom3.get(i).toString());
                                System.out.println("you can either pick the first one that fits 4 people room two or room 3 that fits 8 people");
                                System.out.println("the time slots in room 2 are 9:30-10:00 or 11:00-11:30 or 12:30-1:00 or 2:00-2:30 or 3:30-4:00 or 5:00-5:30");
                                System.out.println("with on time slot being £15 and adding another more time slots would make it £45 ");
                                System.out.println(" the time slots for room 3 are 9:30 - 10:30 or 11:30-12:30 or 1:30-2:30 or 3:30-4:30");
                                System.out.println("for one tie slot it is £20 adding another slot would make it £60");
                                System.out.println("room 3 are hour slots wereas room 2 are half hour slots");
                                System.out.println(meetingRoom2);
                                System.out.println(meetingRoom3);
                    }
                    if (NumberPeople > 4 && NumberPeople <= 8) {
                        System.out.println("You will be in room 3.");
                        for (int i = 0; i < meetingRoom3.size(); i++) {
                            System.out.println(meetingRoom3.get(i).toString());
                            System.out.println(" the time slots for room 3 are 9:30 - 10:30 or 11:30-12:30 or 1:30-2:30 or 3:30-4:30");
                            System.out.println("for one tie slot it is £20 adding another slot would make it £60");
                            System.out.println(meetingRoom3);
                    }
                    if (NumberPeople > 8 && NumberPeople <= 50) {
                        System.out.println("You will be in room 5.");
                        for (int i = 0; i < meetingRoom5.size(); i++) {
                            System.out.println(meetingRoom5.get(i).toString());
                            System.out.println("the tiem slots for room 5 are 9:00-11:00 12:00-2:00 3:00-5:00 ");
                            System.out.println("for 1 time slot it costs£80 for two it would cost you in total £200 for all day it would cost £250");
                            System.out.println(meetingRoom5);
                    }
                }
                break;

            case 2:
                ChangeMeeting();

                break;

            case 3:
                System.out.println("please enter password;");
                String Password = input.next();
                if (Password.equals("password")) {
                    System.out.println("correct.");
                    System.out.println("Would you like to check on the cleaning schedule, have a look at the catering," +
                            " sort out the meeting room items or exit.");
                    System.out.println("press 1 for cleaning," +
                            "Press 2 for Catering and for meeting room items," +
                            "or press 0 to exit.");
                    int Choice = input.nextInt();
                    switch (Choice) {
                        case 1:
                            new Cleaning();
                            break;
                        case 2:
                            new Catering();
                            break;

                        case 0:
                            System.exit(0);
                            return;

                    }
                } else {
                    System.out.println("That is not the Password.");
                }

            case 0:
                System.exit(0);
                return;
        }

    }


    //System.out.println("what time would you like to book for and how long?");
    //System.out.println("would you like to have any Catering for your meeting? this includes teas and coffees. Y or N");


    private static void ChangeMeeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("what would you like to change about your meeting, " +
                "press 1 for the time and slot of the meeting," +
                "press 2 for the catering, and  for ordering items," +
                "press 0 for exit.");
        int ChangingMeeting = input.nextInt();
        switch (ChangingMeeting) {
            case 1:
                new meetingRooms();
                break;
            case 2:
                new menuForCustomers();
                break;

            case 0:
                System.exit(0);
                break;
        }
    }
}





