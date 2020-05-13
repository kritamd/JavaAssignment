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
class Person {
    String name;
   double salary;
    
    public Person(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    
    public void display()
    {
        System.out.println("Salary of " + this.name + " is "+ this.salary);
    }
    
}

class Politician extends Person{
   Politician(String name,double salary)
   {
       super(name,salary);
   }
}

class Sportman extends Person
{
    Sportman(String name,double salary)
    {
        super(name,salary);
    }
}


class Main
{
    public static void main (String args[])
    {
        Politician obj1=new Politician("KP Oli",1000);
        Sportman obj2=new Sportman("Biraj Maharjan",200);
        obj1.display();
        obj2.display();
        
    }
}