package menu;

import java.util.ArrayList;

public class Dessert extends Menu {



    private ArrayList<Dessert> desserts = new ArrayList<>();


    public Dessert() {
    }

    public Dessert(String name, int price, int weight) {
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
    public String createDesserts(ArrayList<Dessert> dessertArrayList) {
        desserts.addAll(dessertArrayList);

        return "Desert successfully saved!";
    }

    @Override
    public ArrayList<Dessert> getAllDessert() {
        return desserts;
    }

    @Override
    public String remove(String foodName) {
        for (Dessert dessert : desserts) {
            if (foodName.toLowerCase().equals(dessert.getName().toLowerCase())){
                desserts.remove(dessert);
            }
        }
        return "Dessert successfully deleted";
    }

    @Override
    public void sortBypPrice(ArrayList<Menu> menus) {
        super.sortBypPrice(menus);
    }

    @Override
    public void getByName(String name, ArrayList<Menu> menus) {
        super.getByName(name, menus);
    }
}
