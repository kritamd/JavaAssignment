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
public class Simpleinterest {
    
    public static void main(String args[]){
    float principle, time, rate;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter principle:");
        principle = sc.nextFloat();

        System.out.println("Enter the time:");
        time = sc.nextFloat();

        System.out.println("Enter the rate");
        rate = sc.nextFloat();
        
     
     interest(principle,time,rate);

    }
    
   static void interest(float p, float r,float t)
    {
        float value=(p*t*r)/100;
        System.out.println("Simple interest is :"+ value);
        
    }
    
    
}
