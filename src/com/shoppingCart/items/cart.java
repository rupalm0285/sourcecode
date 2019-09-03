package com.shoppingCart.items;

import java.util.ArrayList;
import java.util.HashMap;

public class cart {
    ArrayList<item> cartItems = new ArrayList<item>();
    HashMap<Integer,Integer> productCount = new HashMap<>();

    public void addItemToCartByID(int id) {
        item Item = getItemByItemID(id);
        addToCart(Item);
    }

    private item getItemByItemID(int id) {
        item Item = null;
        ArrayList<item> items = new Items().getItems();
        for (item x: items) {
            if (x.getItemID() == id) {
                Item = x;
                break;
            }
        }
        return Item;
    }

    private void addToCart(item Item)
    {
        Integer counter = productCount.get(Item.getItemID()) != null ? productCount.get(Item.getItemID())+1:1;
        productCount.put(Item.getItemID(),counter);
    }

    public void removeItemByPID(int pid) {
        item prod = getItemByItemID(pid);
        cartItems.remove(prod);
    }

    public float calculateCartPrice()
    {
        float cartPrice = 0.0f;
        int qty;
        for (Integer id: productCount.keySet()) {
            item Item = getItemByItemID(id);
            qty = productCount.get(id);
            if((id == 1) || (id == 2))
            {
                cartPrice+= qty*Item.getItemPrice();
            }
            else if(id == 3)
            {
                cartPrice+= (qty/2 +qty%2)*Item.getItemPrice();
            }
            else if(id == 4)
            {
                cartPrice+= (qty/3)*Item.getItemPrice()*2 +(qty%3)*Item.getItemPrice();
            }
        }
        return cartPrice;
    }

    void printCartPrice()
    {
        System.out.println(calculateCartPrice());
    }
    void printCartItems() {
        for (Integer id: productCount.keySet()) {
            item Item = getItemByItemID(id);
            Integer counter = productCount.get(id);
            System.out.println(Item.getItemName() + "-" + counter);
                    }
    }
}
