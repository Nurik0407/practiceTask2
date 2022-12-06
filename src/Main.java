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

        System.out.println("==================================");
        System.out.println("              MENU");
        System.out.println("==================================");
        while (true) {

            System.out.println("1-Dishes  ||  2-Salads  ||  3-Beverages  \n4-Dessert  ||  5-Sort by price  || 6-Get by name ");
            int i = scanner1.nextInt();
            if (i == 1) {
                System.out.println("1-all dishes || 2-remove dishes || 3-");
                int j = scanner1.nextInt();
                if (j == 1) System.out.println(dishes.getAllDishes());
                if (2 == j) {
                    String name = scanner.nextLine();
                    System.out.println(dishes.remove(name));
                } else System.out.println("invalid command");
            }
            if (2 == i) {
                System.out.println("1-all salads || 2-remove salad");
                int j = scanner1.nextInt();
                if (j == 1) System.out.println(salads.getAllSalads());
                if (j == 2){
                    String name = scanner.nextLine();
                    System.out.println(salads.remove(name));
                }else System.out.println("invalid number");
            }if (3 == i){
                System.out.println("1-All beverages || 2-Remove beverages");
                int j = scanner1.nextInt();
                if (j == 1) System.out.println(beverages.getAllBeverages());
                if (j == 2){
                    String name = scanner.nextLine();
                    System.out.println(beverages.remove(name));
                }else System.out.println("invalid command");
            }if (4 == i){
                System.out.println("1-All deserts || 2-Remove dessert");
                int j = scanner1.nextInt();
                if (j == 1) System.out.println(dessert.getAllDessert());
                if (j == 2){
                    String name = scanner.nextLine();
                    System.out.println(dessert.remove(name));
                }
            }if (i == 5){
                dishes.sortBypPrice(menu);
            }if (i == 6){
                System.out.println("Enter name of food:");
                String name = scanner.nextLine();
                dishes.getByName(name,menu);
            }else System.out.println("invalid command!!!");
        }
    }
}
