/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadraticequation;
import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
    
        int a,b,c;
        double r1,r2;
        System.out.println("Enter 3 numbers");
        Scanner scr = new Scanner(System.in);
        a=scr.nextInt();
        b=scr.nextInt();
        c=scr.nextInt();
        //float dis = (b*b)-(4*a*c);
        r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("The square root is: " + r1+ " " + r2);
        
    }
    
}
