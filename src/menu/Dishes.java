package menu;

import java.util.ArrayList;

public class Dishes extends Menu {

    public Dishes() {

    }

    private ArrayList<Dishes> dishes1 = new ArrayList<>();



    public Dishes(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public String createDishes(ArrayList<Dishes> dishesArrayList) {
        dishes1.addAll(dishesArrayList);

        return "Dishes successfully saved!";
    }

    @Override
    public String remove(String foodName) {
        for (Dishes dishes : dishes1) {
            if (foodName.toLowerCase().equals(dishes.getName().toLowerCase())) {
                dishes1.remove(dishes);
            }
        }
        return "Dishes successfully deleted";
    }

    @Override
    public ArrayList<Dishes> getAllDishes() {
        return dishes1;
    }


    @Override
    public void sortBypPrice(ArrayList<Menu> menus) {
        super.sortBypPrice(menus);
    }



    @Override
    public String toString() {
        return "Dishes{\n" + super.toString();
    }

}
