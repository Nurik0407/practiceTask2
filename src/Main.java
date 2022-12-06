import menu.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Dishes dishes = new Dishes();
        Salads salads = new Salads();
        Beverages beverages = new Beverages();
        Dessert dessert = new Dessert();


        ArrayList<Dishes> dishes1 = new ArrayList<>();
        dishes1.add(new Dishes("Plov", 300, 200));
        dishes1.add(new Dishes("Lagman", 350, 250));

        ArrayList<Salads> salads1 = new ArrayList<>();
        salads1.add(new Salads("Sezar", 200, 150));
        salads1.add(new Salads("Olive", 250, 200));

        ArrayList<Beverages> beverages1 = new ArrayList<>();
        beverages1.add(new Beverages("Koka-Kola", 100, 1));

        ArrayList<Dessert> desserts1 = new ArrayList<>();
        desserts1.add(new Dessert("Kruasan", 300, 100));

        ArrayList<Menu> menu = new ArrayList<>();
        menu.addAll(dishes1);
        menu.addAll(salads1);
        menu.addAll(beverages1);
        menu.addAll(desserts1);

//        System.out.println(dishes.createDishes(dishes1));
//        System.out.println(dishes.getAllDishes());
//        dishes.remove("plov");
//        System.out.println(dishes.getAllDishes());
//        dishes.getByName("plov",menu);
//        dishes.sortBypPrice(menu);
//        System.out.println(menu);

        System.out.println("==================================");
        System.out.println("              MENU");
        System.out.println("==================================");


    }
}
