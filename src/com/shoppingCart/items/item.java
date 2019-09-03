package com.shoppingCart.items;

public class item {
    public int itemID;
    String itemName;
    float itemPrice;
    int qty;

    public item() {
    }

    public item(Integer itemID, String name, float price, int qty) {
        this.itemID = itemID;
        this.itemName = name;
        this.itemPrice = price;
        this.qty = qty;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
