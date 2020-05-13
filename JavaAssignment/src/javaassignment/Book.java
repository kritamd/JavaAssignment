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
public class Book {
    String bookName;
    int ISBN;
    String author;
    double price;
    
    
   void get_info(String bookName,int ISBN,String author,double price)
   {
        this.bookName=bookName;
        this.ISBN=ISBN;
        this.author=author;
        this.price=price;
    }
   
   public void displayInfo()
   {
       System.out.println("Name of book is "+ this.bookName + " with" + " ISBN " +this.ISBN+ " whose author is " + this.author +" and Price is "+this.price);
   }
    
   
   public static void main(String args[])
   {
       Book obj=new Book();
       obj.get_info("Java",78755,"Kritam",1078.33);
       obj.displayInfo();
       
   }
}
