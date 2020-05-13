/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;
import java.util.Scanner;
/**
 *
 * @author Kritam
 */
public class Smallest {
 
public static void main(String args[])
        
{
   Scanner sc=new Scanner(System.in);
   int num1,num2,num3;
   
    System.out.println("Enter First Number:");
    num1=sc.nextInt();
    
    System.out.println("Enter Second Number:");
    num2=sc.nextInt();
    
    System.out.println("Enter Third Number:");
    num3=sc.nextInt();
    
    if(num1<num2)
    {
        if(num1<num3)
        {
            System.out.println("Smallest number is :" + num1);
        }
        
        else
        {
            System.out.println("Smallest number is: " + num3);
        }
    }
    
    else
    {
        if(num2<num3)
        {
            System.out.println("Smallest number is :" + num2);
        }
        
        else
        {
            System.out.println("Smallest number is:" + num3);
        }
    }
        

}
}