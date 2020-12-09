package com.lucy.ocp;

public class Production {

    private Option option;
    private String name;
    private int price;

    public Production(Option option, String name, int price) {
        this.option = option;
        this.name = name;
        this.price = price;
    }

    public void updatePrice(int price) {
        this.price = price;
    }

    public Option getOption() {
        return option;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
