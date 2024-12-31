/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaoftraingle;
import java.util.*;

public class AreaofTraingle {

    public static void main(String[] args) {
        float base,height,Area;
       System.out.println("Enter base and height of a triangle");
       Scanner s = new Scanner(System.in);
      base=s.nextFloat();
      height=s.nextFloat();
      Area=(base * height)/2;
      System.out.println("Area of triangle is: "+ Area);
    }
       
      
    }
    
}
