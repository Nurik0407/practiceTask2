package restauranе;

import menu.*;

import java.util.ArrayList;

public interface RestaurantAble {

    String createDishes(ArrayList<Dishes> dishesArrayList);
    String createSalads(ArrayList<Salads> saladsArrayList);
    String createBeverages(ArrayList<Beverages> beveragesArrayList);
    String createDesserts(ArrayList<Dessert> dessertArrayList);

    ArrayList<Dishes> getAllDishes();
    ArrayList<Salads> getAllSalads();
    ArrayList<Beverages> getAllBeverages();
    ArrayList<Dessert> getAllDessert();
    String remove(String foodName);
    void sortBypPrice(ArrayList<Menu> menus);
    void getByName(String name,ArrayList<Menu> menu);

}
