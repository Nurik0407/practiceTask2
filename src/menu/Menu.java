package menu;

import restauranе.RestaurantAble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Menu implements RestaurantAble {
    private String name;
    private int price;
    private int weight;

    @Override
    public String createDishes(ArrayList<Dishes> dishesArrayList) {
        return null;
    }

    @Override
    public String createSalads(ArrayList<Salads> saladsArrayList) {
        return null;
    }

    @Override
    public String createBeverages(ArrayList<Beverages> beveragesArrayList) {
        return null;
    }

    @Override
    public String createDesserts(ArrayList<Dessert> dessertArrayList) {
        return null;
    }

    public Menu() {

    }

    @Override
    public String remove(String foodName) {
        return null;
    }

    @Override
    public ArrayList<Dishes> getAllDishes() {
        return null;
    }

    @Override
    public ArrayList<Salads> getAllSalads() {
        return null;
    }

    @Override
    public ArrayList<Beverages> getAllBeverages() {
        return null;
    }

    @Override
    public ArrayList<Dessert> getAllDessert() {
        return null;
    }

    @Override
    public void sortBypPrice(ArrayList<Menu> menus) {
       Comporator comporator = new Comporator();
       menus.sort(comporator);
        System.out.println("Successfully sorted!\n");
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }

    @Override
    public void getByName(String name, ArrayList<Menu> menu) {
        for (Menu menu1 : menu) {
            if (name.toLowerCase().equals(menu1.getName().toLowerCase())) {
                System.out.println(menu1);
            }
        }
    }


    public Menu(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "name: " + name + '\n' +
                "price: " + price + '\n' +
                "weight: " + weight + "\n\n";
    }
}
