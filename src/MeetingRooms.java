
import java.util.*;

public class MeetingRooms {

        //can book from 9-9:30 from 10:30-11 from 12-12:30 from 1:30-2 from 3-3:30 from 4:30 to 5
        //can book from 9:30-10 from 11-11:30 from 112:30-1 from 2-2:30 from 3:30-4:00 from 5-5:30
        //can book from 9:30-10:30 from 11:30-12:30 from 1:30-2:30 from 3:30-4:30
        //can book 9-9;3-10 from 11-11;30-12 from 1-1;30-2 from 3-3;30-4 from 5-5;30-6
        //Can book nine oclock to eleven from 12 to 2 from 3 to five seperately but you can book more than one slot for a longer meeting
        /*5 rooms room 1 =2 people   room 2 = 4  room 3 = 8
        room 4 = 15 and disabled access  room 5 = 50 people */

        private static Scanner input = new Scanner(System.in);
    private static ArrayList<meetingRoom1> meetingRoom1 = new ArrayList<>();
    private static ArrayList<meetingRoom2> meetingRoom2 = new ArrayList<>();
    private static ArrayList<meetingRoom3> meetingRoom3 = new ArrayList<>();
    private static ArrayList<meettingRoom4> meettingRoom4 = new ArrayList<>();
    private static ArrayList<meetingRoom5> meetingRoom5 = new ArrayList<>();

        public static void main(String[] args) {
            meetingRoom1 = fileHandling.readFile();
            meetingRoom1();
            meetingRoom2 = fileHandling.readFile();
            meetingRoom2();
            meettingRoom4 = fileHandling.readFile();
            meetingRoom4();
            meetingRoom3 = fileHandling.readFile();
            meetingRoom3();
            meetingRoom5 = fileHandling.readFile();
            meetingRoom5();

            /* one deliverer so can only deliver one room at a time
             */
        }

        public static void meetingRoom1() {
            Scanner input = new Scanner(System.in);
            System.out.println("would you like to add a booking, append a booking, delete anything from a booking or exit");
            System.out.println("press 1 to add to the bookings,");
            System.out.println ("press 2 to view the bookings, ");
            System.out.println("press 3 to edit your booking,");
            System.out.println("press 4 to delete from the bookings" );
            System.out.println("press 0 to exit.");
            int meeting1choose = input.nextInt();
            switch (meeting1choose) {
                case 1:
                    addBooking1();
                    break;
                case 2:
                    viewBookingList1();
                    break;
                case 3:
                    editBookingList1();
                    break;
                case 4:
                    deleteBooking1();
                    break;
                case 0:
                    fileHandling.writeFile(meetingRoom1);
                    System.exit(0);
                    break;

            }
        }



        public static void addBooking1() {
            Random random = new Random();
            System.out.println("do you work here? Y or N");
            String answer = input.next();
            if (answer.equals("Y")) {
                System.out.println("please enter the password");
                String Password = input.next();
                if (Password.equals("password")) {
                    System.out.println("that is the correct password.");
                    input.nextLine(); //to prevent skipping lines
                    System.out.println("Please type in a time");
                    double time1 = input.nextDouble();

                    meetingRoom1 myBooking1 = new meetingRoom1(time1);
                    meetingRoom1.add(myBooking1);

                    System.out.println(myBooking1.toString());
                }else{
                    System.out.println("im sorry wrong password.");
                }
            }else {
                System.out.println("Please type in time code");
                int timeCode1 = random.nextInt(4);
                System.out.println("Your booking code is " + timeCode1);
                input.nextLine(); // to prevent skipping lines
                System.out.println("Please type in the name of the person boooking the room");
                String nameOfClient1 = input.nextLine();
                meetingRoom1 myBooking1 = new meetingRoom1( timeCode1, nameOfClient1,);
                meetingRoom1.add(myBooking1);

                System.out.println(myBooking1.toString());
            }




        }

        public static void viewBookingList1() {
            //loop through the array list

            if (meetingRoom1.isEmpty()) {
                System.out.println("sorry there are no bookings at the moment");
            } else {
                for (int i = 0; i < meetingRoom1.size(); i++) {
                    System.out.println(meetingRoom1.get(i).toString());
                }
            }
        }

        public static void editBookingList1() {
            // choose which book you want to edit
            //search for the names in the object in th earray
            int index = getIndex();

            if (index != -1) {
                System.out.println("What  would you like to edit?");

                System.out.println("1 - booking code");
                System.out.println("2 - client name");


                int userChoice1 = input.nextInt();

                switch (userChoice1) {

                    case 1:
                        System.out.println("please type in the booking code");
                        input.nextLine(); // to prevent skipping lines
                        String newTimeCode1 = input.nextLine();
                        meetingRoom1.get(index).setTimeCode(newTimeCode1);
                        break;
                    case 2:
                        System.out.println("please type in the name of the client");
                        input.nextLine();//to prevent skipping lines
                        String newNameOfClient1 = input.nextLine();
                        meetingRoom1.get(index).setNameOfClient(newNameOfClient1);
                        break;


                }
                System.out.println("Done, the booking has beem changed to " + meetingRoom1.get(index).toString());
            } else {
                System.out.println("booking not found");
            }
        }

        public static void deleteBooking1() {
            // choose which book you want to delete
            int index = getIndex();

            if (index != -1) {
                meetingRoom1.remove(index);

            } else {
                System.out.println("Booking not found");
            }
        }

        public static int getIndex() {
            System.out.println("please type in the  booking code");
            String timeCode1 = input.next();

            int index = -1; // to set as the book they have typed in
            if (!meetingRoom1.isEmpty()) {
                for (int i = 0; i < meetingRoom1.size(); i++) {
                    if (timeCode1.equals(meetingRoom1.get(i).getTimeCode())) {
                        return i;

                    }
                }
            }
            return -1;
        }
        static {
            input = new Scanner(System.in);
            meetingRoom1 = new ArrayList();
        }

    public static void meetingRoom2() {
        Scanner input = new Scanner(System.in);
        System.out.println("would you like to add a booking, append a booking, delete anything from a booking or exit");
        System.out.println("press 1 to add to the bookings,");
        System.out.println ("press 2 to view the bookings, ");
        System.out.println("press 3 to edit your booking,");
        System.out.println("press 4 to delete from the bookings" );
        System.out.println("press 0 to exit.");
        int meeting2choose = input.nextInt();
        switch (meeting2choose) {
            case 1:
                addBooking2();
                break;
            case 2:
                viewBookingList2();
                break;
            case 3:
                editBookingList2();
                break;
            case 4:
                deleteBooking2();
                break;
            case 0:
                fileHandling.writeFile(meetingRoom2);
                System.exit(0);
                break;

        }
    }



    public static void addBooking2() {
        Random random = new Random();
        System.out.println("do you work here? Y or N");
        String answer2 = input.next();
        if (answer2.equals("Y")) {
            System.out.println("please enter the password");
            String Password2 = input.next();
            if (Password2.equals("password")) {
                System.out.println("that is the correct password.");
                input.nextLine(); //to prevent skipping lines
                System.out.println("Please type in a time");
                double time2 = input.nextDouble();

                meetingRoom2 myBooking2 = new meetingRoom2(time2);
                meetingRoom1.add(myBooking2);

                System.out.println(myBooking2.toString());
            }else{
                System.out.println("im sorry wrong password.");
            }
        }else {
            System.out.println("Please type in time code");
            int timeCode2 = random.nextInt(4);
            System.out.println("Your booking code is " + timeCode2);
            input.nextLine(); // to prevent skipping lines
            System.out.println("Please type in the name of the person boooking the room");
            String nameOfClient2 = input.nextLine();
            meetingRoom1 myBooking2 = new meetingRoom1( timeCode2, nameOfClient2,);
            meetingRoom1.add(myBooking2);

            System.out.println(myBooking2.toString());
        }




    }

    public static void viewBookingList2() {
        //loop through the array list

        if (meetingRoom2.isEmpty()) {
            System.out.println("sorry there are no bookings at the moment");
        } else {
            for (int i = 0; i < meetingRoom2.size(); i++) {
                System.out.println(meetingRoom2.get(i).toString());
            }
        }
    }

    public static void editBookingList2() {
        // choose which book you want to edit
        //search for the names in the object in th earray
        int index = getIndex2();

        if (index != -1) {
            System.out.println("What  would you like to edit?");

            System.out.println("1 - booking code");
            System.out.println("2 - client name");


            int userChoice2 = input.nextInt();

            switch (userChoice2) {

                case 1:
                    System.out.println("please type in the booking code");
                    input.nextLine(); // to prevent skipping lines
                    String newTimeCode2 = input.nextLine();
                    meetingRoom2.get(index).setTimeCode(newTimeCode2);
                    break;
                case 2:
                    System.out.println("please type in the name of the client");
                    input.nextLine();//to prevent skipping lines
                    String newNameOfClient2 = input.nextLine();
                    meetingRoom2.get(index).setNameOfClient(newNameOfClient2);
                    break;


            }
            System.out.println("Done, the booking has beem changed to " + meetingRoom2.get(index).toString());
        } else {
            System.out.println("booking not found");
        }
    }

    public static void deleteBooking2() {
        // choose which book you want to delete
        int index = getIndex2();

        if (index != -1) {
            meetingRoom2.remove(index);

        } else {
            System.out.println("Booking not found");
        }
    }

    public static int getIndex2() {
        System.out.println("please type in the  booking code");
        String timeCode2 = input.next();

        int index = -1; // to set as the book they have typed in
        if (!meetingRoom2.isEmpty()) {
            for (int i = 0; i < meetingRoom2.size(); i++) {
                if (timeCode2.equals(meetingRoom2.get(i).getTimeCode())) {
                    return i;

                }
            }
        }
        return -1;
    }
    static {
        input = new Scanner(System.in);
        meetingRoom2 = new ArrayList();
    }

    public static void meetingRoom3() {
        Scanner input = new Scanner(System.in);
        System.out.println("would you like to add a booking, append a booking, delete anything from a booking or exit");
        System.out.println("press 1 to add to the bookings,");
        System.out.println ("press 2 to view the bookings, ");
        System.out.println("press 3 to edit your booking,");
        System.out.println("press 4 to delete from the bookings" );
        System.out.println("press 0 to exit.");
        int meeting3choose = input.nextInt();
        switch (meeting3choose) {
            case 1:
                addBooking3();
                break;
            case 2:
                viewBookingList3();
                break;
            case 3:
                editBookingList3();
                break;
            case 4:
                deleteBooking3();
                break;
            case 0:
                fileHandling.writeFile(meetingRoom3);
                System.exit(0);
                break;

        }
    }



    public static void addBooking3() {
        Random random = new Random();
        System.out.println("do you work here? Y or N");
        String answer3 = input.next();
        if (answer3.equals("Y")) {
            System.out.println("please enter the password");
            String Password3 = input.next();
            if (Password3.equals("password")) {
                System.out.println("that is the correct password.");
                input.nextLine(); //to prevent skipping lines
                System.out.println("Please type in a time");
                double time3 = input.nextDouble();

                meetingRoom3 myBooking3 = new meetingRoom3(time3);
                meetingRoom1.add(myBooking3);

                System.out.println(myBooking3.toString());
            }else{
                System.out.println("im sorry wrong password.");
            }
        }else {
            System.out.println("Please type in time code");
            int timeCode3 = random.nextInt(4);
            System.out.println("Your booking code is " + timeCode3);
            input.nextLine(); // to prevent skipping lines
            System.out.println("Please type in the name of the person boooking the room");
            String nameOfClient3 = input.nextLine();
            meetingRoom1 myBooking3 = new meetingRoom3( timeCode3, nameOfClient3,);
            meetingRoom1.add(myBooking3);

            System.out.println(myBooking3.toString());
        }




    }

    public static void viewBookingList3() {
        //loop through the array list

        if (meetingRoom3.isEmpty()) {
            System.out.println("sorry there are no bookings at the moment");
        } else {
            for (int i = 0; i < meetingRoom3.size(); i++) {
                System.out.println(meetingRoom3.get(i).toString());
            }
        }
    }

    public static void editBookingList3() {
        // choose which book you want to edit
        //search for the names in the object in th earray
        int index = getIndex3();

        if (index != -1) {
            System.out.println("What  would you like to edit?");

            System.out.println("1 - booking code");
            System.out.println("2 - client name");


            int userChoice3 = input.nextInt();

            switch (userChoice3) {

                case 1:
                    System.out.println("please type in the booking code");
                    input.nextLine(); // to prevent skipping lines
                    String newTimeCode3 = input.nextLine();
                    meetingRoom3.get(index).setTimeCode(newTimeCode3);
                    break;
                case 2:
                    System.out.println("please type in the name of the client");
                    input.nextLine();//to prevent skipping lines
                    String newNameOfClient3 = input.nextLine();
                    meetingRoom3.get(index).setNameOfClient(newNameOfClient3);
                    break;


            }
            System.out.println("Done, the booking has beem changed to " + meetingRoom3.get(index).toString());
        } else {
            System.out.println("booking not found");
        }
    }

    public static void deleteBooking3() {
        // choose which book you want to delete
        int index = getIndex3();

        if (index != -1) {
            meetingRoom3.remove(index);

        } else {
            System.out.println("Booking not found");
        }
    }

    public static int getIndex3() {
        System.out.println("please type in the  booking code");
        String timeCode3 = input.next();

        int index = -1; // to set as the book they have typed in
        if (!meetingRoom3.isEmpty()) {
            for (int i = 0; i < meetingRoom3.size(); i++) {
                if (timeCode3.equals(meetingRoom3.get(i).getTimeCode())) {
                    return i;

                }
            }
        }
        return -1;
    }
    static {
        input = new Scanner(System.in);
        meetingRoom3 = new ArrayList();
    }

    public static void meetingRoom4() {
        Scanner input = new Scanner(System.in);
        System.out.println("would you like to add a booking, append a booking, delete anything from a booking or exit");
        System.out.println("press 1 to add to the bookings,");
        System.out.println ("press 2 to view the bookings, ");
        System.out.println("press 3 to edit your booking,");
        System.out.println("press 4 to delete from the bookings" );
        System.out.println("press 0 to exit.");
        int meeting1choose = input.nextInt();
        switch (meeting4choose) {
            case 1:
                addBooking4();
                break;
            case 2:
                viewBookingList4();
                break;
            case 3:
                editBookingList4();
                break;
            case 4:
                deleteBooking4();
                break;
            case 0:
                fileHandling.writeFile(meetingRoom4);
                System.exit(0);
                break;

        }
    }



    public static void addBooking4() {
        Random random = new Random();
        System.out.println("do you work here? Y or N");
        String answer4 = input.next();
        if (answer4.equals("Y")) {
            System.out.println("please enter the password");
            String Password4 = input.next();
            if (Password4.equals("password")) {
                System.out.println("that is the correct password.");
                input.nextLine(); //to prevent skipping lines
                System.out.println("Please type in a time");
                double time4 = input.nextDouble();

                meettingRoom4 myBooking4 = new meettingRoom4(time4);
                meettingRoom4.add(myBooking4);

                System.out.println(myBooking4.toString());
            }else{
                System.out.println("im sorry wrong password.");
            }
        }else {
            System.out.println("Please type in time code");
            int timeCode4 = random.nextInt(4);
            System.out.println("Your booking code is " + timeCode4);
            input.nextLine(); // to prevent skipping lines
            System.out.println("Please type in the name of the person boooking the room");
            String nameOfClient4 = input.nextLine();
            meettingRoom4 myBooking4 = new meettingRoom4( timeCode4, nameOfClient4,);
            meettingRoom4.add(myBooking4);

            System.out.println(myBooking4.toString());
        }




    }

    public static void viewBookingList4() {
        //loop through the array list

        if (meettingRoom4.isEmpty()) {
            System.out.println("sorry there are no bookings at the moment");
        } else {
            for (int i = 0; i < meettingRoom4.size(); i++) {
                System.out.println(meettingRoom4.get(i).toString());
            }
        }
    }

    public static void editBookingList4() {
        // choose which book you want to edit
        //search for the names in the object in th earray
        int index = getIndex4();

        if (index != -1) {
            System.out.println("What  would you like to edit?");

            System.out.println("1 - booking code");
            System.out.println("2 - client name");


            int userChoice4 = input.nextInt();

            switch (userChoice4) {

                case 1:
                    System.out.println("please type in the booking code");
                    input.nextLine(); // to prevent skipping lines
                    String newTimeCode4 = input.nextLine();
                    meettingRoom4.get(index).setTimeCode(newTimeCode4);
                    break;
                case 2:
                    System.out.println("please type in the name of the client");
                    input.nextLine();//to prevent skipping lines
                    String newNameOfClient4 = input.nextLine();
                    meettingRoom4.get(index).setNameOfClient(newNameOfClient4);
                    break;


            }
            System.out.println("Done, the booking has beem changed to " + meetingRoom4.get(index).toString());
        } else {
            System.out.println("booking not found");
        }
    }

    public static void deleteBooking4() {
        // choose which book you want to delete
        int index = getIndex4();

        if (index != -1) {
            meetingRoom1.remove(index);

        } else {
            System.out.println("Booking not found");
        }
    }

    public static int getIndex4() {
        System.out.println("please type in the  booking code");
        String timeCode4 = input.next();

        int index = -1; // to set as the book they have typed in
        if (!meettingRoom4.isEmpty()) {
            for (int i = 0; i < meettingRoom4.size(); i++) {
                if (timeCode4.equals(meettingRoom4.get(i).getTimeCode())) {
                    return i;

                }
            }
        }
        return -1;
    }
    static {
        input = new Scanner(System.in);
        meettingRoom4 = new ArrayList();
    }

    public static void meetingRoom5() {
        Scanner input = new Scanner(System.in);
        System.out.println("would you like to add a booking, append a booking, delete anything from a booking or exit");
        System.out.println("press 1 to add to the bookings,");
        System.out.println ("press 2 to view the bookings, ");
        System.out.println("press 3 to edit your booking,");
        System.out.println("press 4 to delete from the bookings" );
        System.out.println("press 0 to exit.");
        int meeting5choose = input.nextInt();
        switch (meeting5choose) {
            case 1:
                addBooking5();
                break;
            case 2:
                viewBookingList5();
                break;
            case 3:
                editBookingList5();
                break;
            case 4:
                deleteBooking5();
                break;
            case 0:
                fileHandling.writeFile(meetingRoom5);
                System.exit(0);
                break;

        }
    }



    public static void addBooking5() {
        Random random = new Random();
        System.out.println("do you work here? Y or N");
        String answer5 = input.next();
        if (answer5.equals("Y")) {
            System.out.println("please enter the password");
            String Password5 = input.next();
            if (Password5.equals("password")) {
                System.out.println("that is the correct password.");
                input.nextLine(); //to prevent skipping lines
                System.out.println("Please type in a time");
                double time5 = input.nextDouble();

                meetingRoom5 myBooking5 = new meetingRoom5(time5);
                meetingRoom5.add(myBooking5);

                System.out.println(myBooking5.toString());
            }else{
                System.out.println("im sorry wrong password.");
            }
        }else {
            System.out.println("Please type in time code");
            int timeCode5 = random.nextInt(4);
            System.out.println("Your booking code is " + timeCode5);
            input.nextLine(); // to prevent skipping lines
            System.out.println("Please type in the name of the person boooking the room");
            String nameOfClient5 = input.nextLine();
            meetingRoom5 myBooking5 = new meetingRoom5( timeCode5, nameOfClient5);
            meetingRoom5.add(myBooking5);

            System.out.println(myBooking5.toString());
        }




    }

    public static void viewBookingList5() {
        //loop through the array list

        if (meetingRoom5.isEmpty()) {
            System.out.println("sorry there are no bookings at the moment");
        } else {
            for (int i = 0; i < meetingRoom5.size(); i++) {
                System.out.println(meetingRoom5.get(i).toString());
            }
        }
    }

    public static void editBookingList5() {
        // choose which book you want to edit
        //search for the names in the object in th earray
        int index = getIndex5();

        if (index != -1) {
            System.out.println("What  would you like to edit?");

            System.out.println("1 - booking code");
            System.out.println("2 - client name");


            int userChoice5 = input.nextInt();

            switch (userChoice5) {

                case 1:
                    System.out.println("please type in the booking code");
                    input.nextLine(); // to prevent skipping lines
                    String newTimeCode5 = input.nextLine();
                    meetingRoom5.get(index).setTimeCode(newTimeCode5);
                    break;
                case 2:
                    System.out.println("please type in the name of the client");
                    input.nextLine();//to prevent skipping lines
                    String newNameOfClient5 = input.nextLine();
                    meetingRoom1.get(index).setNameOfClient(newNameOfClient5);
                    break;


            }
            System.out.println("Done, the booking has beem changed to " + meetingRoom5.get(index).toString());
        } else {
            System.out.println("booking not found");
        }
    }

    public static void deleteBooking5() {
        // choose which book you want to delete
        int index = getIndex5();

        if (index != -1) {
            meetingRoom5.remove(index);

        } else {
            System.out.println("Booking not found");
        }
    }

    public static int getIndex5() {
        System.out.println("please type in the  booking code");
        String timeCode5 = input.next();

        int index = -1; // to set as the book they have typed in
        if (!meetingRoom5.isEmpty()) {
            for (int i = 0; i < meetingRoom5.size(); i++) {
                if (timeCode5.equals(meetingRoom5.get(i).getTimeCode())) {
                    return i;

                }
            }
        }
        return -1;
    }
    static {
        input = new Scanner(System.in);
        meetingRoom5 = new ArrayList();
    }
}
