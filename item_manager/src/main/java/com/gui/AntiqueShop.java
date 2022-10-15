package com.gui;

import java.util.Scanner;

import com.dto.Item;
import com.dto.Painting;
import com.dto.Statue;
import com.dto.Vase;

public class AntiqueShop {
    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Create a Vase");
            System.out.println("2.Create a Statue");
            System.out.println("3.Create a Painting");
            System.out.println("4.Display the item");
            System.out.println("Input a choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPaiting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPaiting();
                        }
                    } else {
                        System.out.println("You need to creat an object");
                    }
                    break;
                // default:
                // break;
            }
        } while (choice <= 4);
    }
}
