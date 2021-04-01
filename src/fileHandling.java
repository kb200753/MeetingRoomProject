import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class fileHandling {
    public static String folderDirectory = System.getProperty("user.dir") + "/menuList.txt";
    public static String folderDirectory1 = System.getProperty("user.dir") + "/meetingRoom1.txt";
    public static String folderDirectory2 = System.getProperty("user.dir") + "/meetingRoom2.txt";
    public static String folderDirectory3 = System.getProperty("user.dir") + "/meetingRoom3.txt";
    public static String folderDirectory4 = System.getProperty("user.dir") + "/meetingRoom4.txt";
    public static String folderDirectory5 = System.getProperty("user.dir") + "/meetingRoom5.txt";
    public static String folderDirectory6 = System.getProperty("user.dir") + "/Cleaning.txt";

    public static void writeFile(ArrayList<Menu> menuList) {

        try {
            FileWriter writeToFile = new FileWriter(folderDirectory, true);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for (int i = 0; i < menuList.size(); i++) {
                printToFile.println(menuList.get(i).toString());
            }
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList<Menu> readFile() {
        ArrayList<Menu> menuList = new ArrayList<>();
        String lineFromFile;
        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory));
            while ((lineFromFile = read.readLine()) != null) {
                String[] menuDetails = lineFromFile.split(",");

                Menu myMenu = new Menu(menuDetails[0], menuDetails[1], menuDetails[2], Double.parseDouble(menuDetails[3]));
                menuList.add(myMenu);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return menuList;
    }

    public static void writeFile1(ArrayList<meetingRoom1> meetingRoom1) {

        try {
            FileWriter writeToFile1 = new FileWriter(folderDirectory1, true);
            PrintWriter printToFile1 = new PrintWriter(writeToFile1);
            for (int i = 0; i < meetingRoom1.size(); i++) {
                printToFile1.println(meetingRoom1.get(i).toString());
            }
            printToFile1.close();
            writeToFile1.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList<meetingRoom1> readFile1() {
        ArrayList<meetingRoom1> meetingRoom1 = new ArrayList<>();
        String lineFromFile;
        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory1));
            while ((lineFromFile = read.readLine()) != null) {
                String[] room1Details = lineFromFile.split(",");

                meetingRoom1 meetingRoomN1 = new meetingRoom1(Double.parseDouble(room1Details[0]), room1Details[1], room1Details[2], Double.parseDouble(room1Details[3]));
                meetingRoom1.add(meetingRoomN1);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return meetingRoom1;
    }

    public static void writeFile2(ArrayList<meetingRoom2> meetingRoom2) {

        try {
            FileWriter writeToFile2 = new FileWriter(folderDirectory2, true);
            PrintWriter printToFile2 = new PrintWriter(writeToFile2);
            for (int i = 0; i < meetingRoom2.size(); i++) {
                printToFile2.println(meetingRoom2.get(i).toString());
            }
            printToFile2.close();
            writeToFile2.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList<meetingRoom2> readFile2() {
        ArrayList<meetingRoom2> meetingRoom2 = new ArrayList<>();
        String lineFromFile;
        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory2));
            while ((lineFromFile = read.readLine()) != null) {
                String[] room2Details = lineFromFile.split(",");

                meetingRoom2 meetingRoomN2 = new meetingRoom2(Double.parseDouble(room2Details[0]), room2Details[1], room2Details[2], Double.parseDouble(room2Details[3]));
                meetingRoom2.add(meetingRoomN2);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return meetingRoom2;
    }
    public static void writeFile3(ArrayList<meetingRoom3> meetingRoom3) {

        try {
            FileWriter writeToFile3 = new FileWriter(folderDirectory, true);
            PrintWriter printToFile3 = new PrintWriter(writeToFile3);
            for (int i = 0; i < meetingRoom3.size(); i++) {
                printToFile3.println(meetingRoom3.get(i).toString());
            }
            printToFile3.close();
            writeToFile3.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList<meetingRoom3> readFile3() {
        ArrayList<meetingRoom3> meetingRoom3 = new ArrayList<>();
        String lineFromFile;
        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory3));
            while ((lineFromFile = read.readLine()) != null) {
                String[] room3Details = lineFromFile.split(",");

                meetingRoom3 meetingRoomN3 = new meetingRoom3(Double.parseDouble(room3Details[0]), room3Details[1], room3Details[2], Double.parseDouble(room3Details[3]));
                meetingRoom3.add(meetingRoomN3);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return meetingRoom3;
    }
    public static void writeFile4(ArrayList<meettingRoom4> meettingRoom4) {

        try {
            FileWriter writeToFile4 = new FileWriter(folderDirectory4, true);
            PrintWriter printToFile4 = new PrintWriter(writeToFile4);
            for (int i = 0; i < meettingRoom4.size(); i++) {
                printToFile4.println(meettingRoom4.get(i).toString());
            }
            printToFile4.close();
            writeToFile4.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList<meettingRoom4> readFile4() {
        ArrayList<meettingRoom4> meettingRoom4 = new ArrayList<>();
        String lineFromFile;
        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory4));
            while ((lineFromFile = read.readLine()) != null) {
                String[] room4Details = lineFromFile.split(",");

                meettingRoom4 meetingRoomN4 = new meettingRoom4(Double.parseDouble(room4Details[0]), room4Details[1], room4Details[2], Double.parseDouble(room4Details[3]));
                meettingRoom4.add(meetingRoomN4);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return meettingRoom4;
    }
    public static void writeFile5(ArrayList<meetingRoom5> meetingRoom5) {

        try {
            FileWriter writeToFile5 = new FileWriter(folderDirectory5, true);
            PrintWriter printToFile5 = new PrintWriter(writeToFile5);
            for (int i = 0; i < meetingRoom5.size(); i++) {
                printToFile5.println(meetingRoom5.get(i).toString());
            }
            printToFile5.close();
            writeToFile5.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList<meetingRoom5> readFile5() {
        ArrayList<meetingRoom5> meetingRoom5 = new ArrayList<>();
        String lineFromFile;
        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory5));
            while ((lineFromFile = read.readLine()) != null) {
                String[] room5Details = lineFromFile.split(",");

                meetingRoom5 meetingRoomN5 = new meetingRoom5(Double.parseDouble(room5Details[0]), room5Details[1], room5Details[2], Double.parseDouble(room5Details[3]));
                meetingRoom5.add(meetingRoomN5);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return meetingRoom5;
    }

    public static void writeFile6(ArrayList<Clean> Cleaning) {

        try {
            FileWriter writeToFile6 = new FileWriter(folderDirectory6, true);
            PrintWriter printToFile6 = new PrintWriter(writeToFile6);
            for (int i = 0; i < Cleaning.size(); i++) {
                printToFile6.println(Cleaning.get(i).toString());
            }
            printToFile6.close();
            writeToFile6.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList<Clean> readFile6() {
        ArrayList<Clean> Cleaning = new ArrayList<Clean>();
        String lineFromFile;
        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory6));
            while ((lineFromFile = read.readLine()) != null) {
                String[] cleaningDetails = lineFromFile.split(",");

                Cleaning myCleaning = new Cleaning(cleaningDetails[0], cleaningDetails[1], cleaningDetails[2]);
                Cleaning.add(myCleaning);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return Cleaning;
    }


}