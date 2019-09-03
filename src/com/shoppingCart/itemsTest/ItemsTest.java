package com.shoppingCart.itemsTest;

import com.shoppingCart.items.Items;
import com.shoppingCart.items.item;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemsTest {

    @Test
    //Test to copmare weather the two arraylists are same or not.
    void initializeItems() {
        Items its = new Items();
        its.initializeItems();
        ArrayList<item> testItems = new ArrayList<item>();
        String[] testItemNames = {"Apple", "Banana", "Melon", "Lime"};
        float[] testItemPrice = {10.00f, 20.00f, 60.00f, 15.00f};
        for (int i = 0; i < testItemNames.length; i++) {
            testItems.add(new item(i + 1, testItemNames[i], testItemPrice[i], 0));
        }
        assertEquals(testItems,its.items);
    }
}