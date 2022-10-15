package com.dto;

import java.io.EOFException;
import java.util.Scanner;

public class Vase extends Item {
    private int height;
    private String material;

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}


    public Vase(){
        /*... */
    }

    public Vase(int value, String creator, int height,String material){
        setCreator(creator);
        setValue(value);
        setCreator(material);
        setHeight(height);
    }

    public void inputVase(){
        input();
        boolean bool = false;
        do {
            bool = false;
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter height:");
                setHeight(sc.nextInt());
                if(getHeight()<=0){
                    throw new EOFException();
                }
                sc.nextLine();
                System.out.print("Enter material:");
                setMaterial(sc.nextLine());
                if(getMaterial() == null){
                    throw new EOFException();
                }
                // sc.nextLine();

            } catch (Exception e) {
                bool = true;
                System.out.println("Enter again please.");
            }
        } while (bool == true);
        
    }

    public void outputVase() {
        output();
        System.out.println("Material:"+getMaterial());
        System.out.println("Height:"+getHeight());

    }
}
