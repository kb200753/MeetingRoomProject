import java.util.ArrayList;
import java.util.Scanner;

public class menuForCustomers extends book {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Menu> menuList = new ArrayList<>();

    public static void main(String[] args) {

        menuList = fileHandling.readFile();
    }

    public static void menuForCustomers() {
        if (menuList.isEmpty()) {


            System.out.println("sorry there is no food or items at the moment.");
        } else {
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println(menuList.get(i).toString());
            }
        }
    }
}

