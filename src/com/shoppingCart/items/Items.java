package com.shoppingCart.items;

import java.util.ArrayList;

public class Items {
    private final ArrayList<item> items = new ArrayList<item>();

    public Items () {
        this.initializeItems();
    }

    public ArrayList<item> getItems() {
        return items;
    }

    public void initializeItems() {
//        This shall be imported from json file hosted at:
//        https://gist.githubusercontent.com/rupalm0285/e0a0f0766436449c07ada5840fceb3f4/raw/139fa384187109ca2561ca8132b1f308cac90688/Stocks
        String [] itemNames = {"Apple", "Banana","Melon","Lime"};
        float [] itemPrice = {70.00f, 20.00f, 50.00f,15.00f};
        for (int i=0; i < itemNames.length; i++) {
            this.items.add(new item(i+1, itemNames[i], itemPrice[i],0));
        }
    }
}
