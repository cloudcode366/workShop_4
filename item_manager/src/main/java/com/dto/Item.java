package com.dto;

import java.io.EOFException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Item {
    private int value;
    private String creator;

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Item() {
        /* ... */}

    public Item(int value, String creator) {
        setCreator(creator);
        setValue(value);
    }

    public void output() {
        System.out.println("Value:" + getValue());
        System.out.println("Creator:" + getCreator());
    }

    public void input() {
        boolean bool = false;
        do {
            bool = false;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter value:");
                setValue(sc.nextInt());
                if (getValue() <= 0) {
                    throw new EOFException();
                }
                sc.nextLine();
                System.out.print("Enter creator:");
                setCreator(sc.nextLine());
                if (getCreator() == null) {
                    throw new EOFException();
                }
                // sc.nextLine();
            } catch (Exception e) {
                bool = true;
                System.out.println("Enter again please.");
            }
        } while (bool == true);
    }
}
