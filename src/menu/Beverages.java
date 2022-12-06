package menu;

import java.util.ArrayList;

public class Beverages extends Menu {
    private ArrayList<Beverages> beverages = new ArrayList<>();



    public Beverages() {
    }

    public Beverages(String name, int price, int weight) {
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
    public String createBeverages(ArrayList<Beverages> beveragesArrayList) {
        beverages.addAll(beveragesArrayList);

        return "Beverages successfully saved!";
    }

    @Override
    public ArrayList<Beverages> getAllBeverages() {
        return beverages;
    }

    @Override
    public String remove(String foodName) {
        for (Beverages beverage : beverages) {
            if (foodName.toLowerCase().equals(beverage.getName().toLowerCase())) {
                beverages.remove(beverage);
            }
        }
        return "Beverage successfully deleted";
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
