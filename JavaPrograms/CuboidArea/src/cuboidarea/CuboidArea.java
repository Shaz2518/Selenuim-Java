/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuboidarea;
import java.util.Scanner;

public class CuboidArea {

    public static void main(String[] args) {
        int length, breadth, height;
        int area , volume;
        System.out.println("Enter length , breadth and height of cuboid");
        Scanner scr = new Scanner(System.in);
        length = scr.nextInt();
        breadth = scr.nextInt();
        height = scr.nextInt();
        area= 2 * (length * breadth  + breadth * height + length * height);
        volume = length * breadth * height;
        System.out.println("Area of cuboid is: " + area);
        System.out.println("Volume of cuboid is:" + volume);      
      
    }
    
}
