package com.shoppingCart.itemsTest;

import com.shoppingCart.items.UserInterface;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserInterfaceTest {

    @Test
    void startScreen() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        new UserInterface().startScreen();
        assertEquals("1. Display Store Products",outContent.toString());
    }

    @Test
    //Similar test case to see products menu.
    void storeProductsMenu() {
    }

    @Test
    void menu() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        UserInterface UI = new UserInterface();
        UI.ch = 56;
        UI.menu();
        assertEquals("1. Display Store Products",outContent.toString());
    }
}