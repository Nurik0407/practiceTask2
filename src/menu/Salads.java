package menu;

import java.util.ArrayList;

public class Salads extends Menu {
    private ArrayList<Salads> saladsArrayList = new ArrayList<>();


    public Salads() {
    }

    public Salads(String name, int price, int weight) {
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
    public String createSalads(ArrayList<Salads> saladsArrayList) {
        saladsArrayList.addAll(saladsArrayList);

        return "Salads successfully saved!";
    }

    @Override
    public ArrayList<Salads> getAllSalads() {
        return saladsArrayList;
    }

    @Override
    public String remove(String foodName) {
        for (Salads salads : saladsArrayList) {
            if (foodName.toLowerCase().equals(salads.getName().toLowerCase())){
                saladsArrayList.remove(salads);
            }
        }
        return "Salad successfully deleted";
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
