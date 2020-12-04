package Ibook.Review.demo.entity;

import java.util.List;

public class FruitWrapper {

    public List<String> fruits;

    public int getSize() {
        return fruits.size();
    }

    public String getIcon(int x) {
        return fruits.get(x);
    }

}
