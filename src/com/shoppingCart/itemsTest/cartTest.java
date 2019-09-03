package com.shoppingCart.itemsTest;

import com.shoppingCart.items.cart;
import com.shoppingCart.items.item;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class cartTest {

    @Test
    void calculateCartPrice() {
        cart Cart = new cart();
        Cart.productCount.put(1, 2);//Adding 2 apples in basket.Price:70
        Cart.productCount.put(2, 1);//Adding 1 Banana in basket.Price:20
        Cart.productCount.put(3, 3);//Adding 3 Melons in baseket, which are one + one free.Price:50
        Cart.productCount.put(4, 3);//Adding 4 Limes in basket, which are three @ price of 2.Price:15
        float result = 70 + 20 + 2 * 50 + 2 * 15;
        assertEquals(result, Cart.calculateCartPrice());
    }

    @Test
    void addItemToCartByID() {
        item test1 = new item(1,"Apple",60.0f,1);
        addToCart(test1);
        assertEquals(Integer.toString(test1.itemID),"2");
    }

    @Test
    void removeItemByPID() {
        item test1 = new item(1,"Apple",60.0f,1);
        cart testCart = new cart();
        testCart.addToCart(test1);
        testCart.removeItemByPID(1);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        testCart.printCartItems();
        assertEquals("Apple-1\r\n",outContent.toString());
    }


    @Test
    void printCartPrice() {
        cart testCart = new cart();
        item test1 = new item(1,"Apple",60.0f,1);
        item test2 = new item(2,"Banana",30.0f,2);
        item test3 = new item(1,"Lime",20.0f,4);
        testCart.addToCart(test1);
        testCart.addToCart(test2);
        testCart.addToCart(test3);
        float total = 120.0f;
        assertEquals(Float.toString(total),Float.toString(testCart.calculateCartPrice()));
    }

    @Test
    void printCartItems() {
        cart testCart = new cart();
        item test1 = new item(1,"Apple",60.0f,1);
        item test2 = new item(2,"Banana",30.0f,2);
        testCart.addToCart(test1);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        testCart.printCartItems();
        //assertEquals("Apple-1\r\n",outContent.toString());
        assertEquals("Apple-1",outContent.toString());
    }

    @Test
    //Below we can write test case to test, weather item gets added to cart or not.
    void addToCart(item Item) {

    }
}