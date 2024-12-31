/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author localadminuser
 */
import java.util.Scanner;
public class JavaApplication4 {

        public static void main(String[] args) {
        	{	
		int side1, side2, side3;
		float s;
		double area;
		System.out.println("Enter 3 sides");
		Scanner scr = new Scanner(System.in);
		side1 = scr.nextInt();
		side2 = scr.nextInt();
		side3 = scr.nextInt();
		s = (side1 + side2 + side3)/2f;
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area of Traiangle is: " + area);
	}
}
    }
    
}
