package menu;

import java.util.Comparator;

public class Comporator implements Comparator<Menu> {
    @Override
    public int compare(Menu o1, Menu o2) {
        return o2.getPrice()-o1.getPrice();
    }
}
