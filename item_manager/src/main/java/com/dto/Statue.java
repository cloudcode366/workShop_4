package com.dto;

import java.io.EOFException;
import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Statue(){
        /*... */
    }

    public Statue(int value, String creator, int weight, String colour){
        setColour(colour);
        setCreator(creator);
        setValue(value);
        setWeight(weight);
    }

    public void outputStatue(){
        output();
        System.out.println("Weight:"+getWeight());
        System.out.println("Colour:"+getColour());
    }

    public void inputStatue(){
        input();
        boolean bool = false;
        do {
            try {
                bool = false;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter weight:");
                setWeight(sc.nextInt());
                if (getWeight()<=0) {
                    throw new EOFException();
                }
                sc.nextLine();
                System.out.print("Enter colour:");
                setColour(sc.nextLine());
                if (getColour()==null) {
                    throw new EOFException();
                }
                // sc.nextLine();
            } catch (Exception e) {
                bool = true;
                System.out.println("Error input,  please enter again.");
            }
        } while (bool==true);
    }


}
