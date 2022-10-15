package com.dto;

import java.io.EOFException;
import java.util.Scanner;

public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return this.isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return this.isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public Painting() {
        /* ... */
    }

    // constructor for set variable
    public Painting(int value, String creator, int height, int width, boolean isIsWatercolour, boolean isFramed) {
        setHeight(height);
        setWidth(width);
        setIsFramed(isFramed);
        setIsWatercolour(isIsWatercolour);
        setCreator(creator);
        setValue(value);
    }

    public void outputPaiting() {
        output();
        System.out.println("Height:" + getHeight());
        System.out.println("Width:" + getWidth());
        System.out.println("Is Water colour:" + isIsWatercolour());
        System.out.println("Is framed" + isIsFramed());
    }

    public void inputPaiting() {
        input();
        boolean bool = false;
        do {
            bool = false;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter height:");
                setHeight(sc.nextInt());
                if (getHeight() <= 0) {
                    throw new EOFException();
                }
                sc.nextLine();
                System.out.print("Enter width:");
                setWidth(sc.nextInt());
                if (getWidth() <= 0) {
                    throw new EOFException();
                }
                sc.nextLine();
                System.out.print("Enter is watercolour:");
                setIsWatercolour(sc.nextBoolean());
                if (isIsWatercolour() != true && isIsWatercolour() != false) {
                    throw new EOFException();
                }
                sc.nextLine();
                System.out.print("Enter is frame:");
                setIsFramed(sc.nextBoolean());
                if (isIsFramed() != true && isIsFramed() != false) {
                    throw new EOFException();
                }
                // sc.nextLine();
            } catch (Exception e) {
                bool = true;
                System.out.println("Error input, please enter again.");
            }
        } while (bool == true);
    }

}
