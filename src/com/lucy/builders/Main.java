package com.lucy.builders;

import static com.lucy.builders.NyPizza.Size.SMALL;

public class Main {

    public static void main(String[] args){

        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();

    }
}
