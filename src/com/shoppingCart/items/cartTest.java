package com.shoppingCart.items;

import static org.junit.jupiter.api.Assertions.*;

class cartTest {

    @org.junit.jupiter.api.Test
    void calculateCartPrice() {
        cart Cart = new cart();
        Cart.productCount.put(1,2);//Adding 2 apples in basket.Price:70
        Cart.productCount.put(2,1);//Adding 1 Banana in basket.Price:20
        Cart.productCount.put(3,3);//Adding 3 Melons in baseket, which are one + one free.Price:50
        Cart.productCount.put(4,3);//Adding 4 Limes in basket, which are three @ price of 2.Price:15
        float result = 2*70+20+2*50+2*15;
        assertEquals(result,Cart.calculateCartPrice());
    }
}