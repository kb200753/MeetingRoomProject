import java.util.*;

public class Catering {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Menu> menuList = new ArrayList<>();

    public static void main(String[] args) {
        menuList = fileHandling.readFile();
        menu();
        /* one deliverer so can only deliver one room at a time
         */
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("would you like to add to menu, append menu, delete anything from the menu or exit");
        System.out.println("press 1 to add to the menu," +
                "press 2 to view the menu, " +
                "press 3 to edit the menu," +
                "press 4 to delete from the menu," +
                "press 0 to exit.");
        int menuchoose = input.nextInt();
        switch (menuchoose) {
            case 1:
                addFood();
                break;
            case 2:
                viewMenu();
                break;
            case 3:
                editMenu();
                break;
            case 4:
                deleteMenu();
                break;
            case 0:
                fileHandling.writeFile(menuList);
                System.exit(0);
                break;

        }
    }

    public static void foodWhen() {
        System.out.println("What would you like in terms of catering." +
                "we offer tea, coffee, pastries, sandwiches and water. ");

    }

    public static void addFood() {
        input.nextLine(); //to prevent skipping lines
        System.out.println("Please type in a name");
        String name = input.nextLine();
        System.out.println("Please type in food code");
        String foodCode = input.next();
        input.nextLine(); // to prevent skipping lines
        System.out.println("Please type in the food type");
        String type = input.nextLine();
        System.out.println("Please type in a price");
        double price = input.nextDouble();


        Menu myMenu = new Menu(name, foodCode, type, price);
        menuList.add(myMenu);

        System.out.println(myMenu.toString());


    }

    public static void viewMenu() {
        //loop through the array list

        if (menuList.isEmpty()) {
            System.out.println("sorry there is no food or items at the moment.");
        } else {
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println(menuList.get(i).toString());
            }
        }
    }

    public static void editMenu() {
        // choose which book you want to edit
        //search for the names in the object in th earray
        int index = getIndex();

        if (index != -1) {
            System.out.println("What  would you like to edit?");
            System.out.println("1 - name");
            System.out.println("2 - food code");
            System.out.println("3 - food type");
            System.out.println("4 - price");

            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("please type in a name");
                    input.nextLine();//to prevent skipping lines
                    String newName = input.nextLine();
                    menuList.get(index).setName(newName);
                    break;
                case 2:
                    System.out.println("please type in an food code");
                    input.nextLine(); // to prevent skipping lines
                    String newfoodCode = input.nextLine();
                    menuList.get(index).setFoodCode(newfoodCode);
                    break;
                case 3:
                    System.out.println("please type in an author");
                    input.nextLine();//to prevent skipping lines
                    String newType = input.nextLine();
                    menuList.get(index).setType(newType);
                    break;
                case 4:
                    System.out.println("please type in a price");

                    Double newPrice = input.nextDouble();
                    menuList.get(index).setPrice(newPrice);
                    break;

            }
            System.out.println("Done, the Menu has beem changed to " + menuList.get(index).toString());
        } else {
            System.out.println("Menu not found");
        }
    }

    public static void deleteMenu() {
        // choose which book you want to delete
        int index = getIndex();

        if (index != -1) {
            menuList.remove(index);

        } else {
            System.out.println("Book not found");
        }
    }

    public static int getIndex() {
        System.out.println("please type in the  food code");
        String foodCode = input.next();

        int index = -1; // to set as the book they have typed in
        if (!menuList.isEmpty()) {
            for (int i = 0; i < menuList.size(); i++) {
                if (foodCode.equals(menuList.get(i).getFoodCode())) {
                    return i;

                }
            }
        }
        return -1;
    }
    static {
        input = new Scanner(System.in);
        menuList = new ArrayList();
    }
}

