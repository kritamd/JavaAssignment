/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

/**
 *
 * @author Kritam
 */
import java.util.Scanner;
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int number1,number2;
      Scanner obj=new Scanner(System.in);
        System.out.println("Enter First Number:");
        number1=obj.nextInt();
        System.out.println("Enter Second Number:");
        number2=obj.nextInt();
        System.out.println("The sum of numbers are:"+(number1+number2));
        
    }
    
}
