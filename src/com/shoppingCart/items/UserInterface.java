package com.shoppingCart.items;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    cart Cart = new cart();
    public int ch = 0;

    public UserInterface() {
        menu();
    }

    public void startScreen() {
        System.out.println("1. Display Store Products");
        System.out.println("2. Display Cart");
        System.out.println("3. Final Cost");
        System.out.println("0. Exit");
    }

    public void storeProductsMenu() {
        System.out.println("1. Add to Cart");
        System.out.println("2. Remove From Cart");
        System.out.println("0. Exit");
    }

    public void menu() {
        do {
            startScreen();
            getUserInput();

            switch (ch) {
                case 1:
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    innerChoice1();
                    break;
                case 2:
                    showCart();
                    break;
                case 3:
                    priceCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Entered value is not correct input");
                    break;
            }
        } while (ch != 0);
    }

    private void innerChoice1() {
        switch (ch) {
            case 1:
                addItemToCart();
                showCart();
                break;
            case 2:
                removeItemFromCart();
                break;
            default:
                break;
        }
    }

    private int getUserInput() {
        Scanner in = new Scanner(System.in);
        try {
            ch = in.nextInt();
        }
        catch (InputMismatchException exception)
        {
            System.out.println("Please enter integer values from the one shown in display");
            in.next();
            ch = 5;
        }
        return ch;
    }

    private void displayStoreProducts() {
        ArrayList<item> items = new Items().getItems();
        for (item x : items) {
            System.out.println(
                    x.getItemID() + "- " +
                            x.getItemName() + " " +
                            x.getItemPrice() + " "
            );
        }
    }

    private void addItemToCart() {
        int id = getUserInput();
        Cart.addItemToCartByID(id);
    }

    private void showCart() {
        Cart.printCartItems();
    }

    private void priceCart() {
        Cart.printCartPrice();
    }

    private void removeItemFromCart() {
        int id = getUserInput();
        Cart.removeItemByPID(id);
    }
}
