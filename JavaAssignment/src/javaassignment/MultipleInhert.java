/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;
interface HumanEat
{
    void eat();
}
interface HumanTravel
{
    void travel();
}
    
class Human implements HumanEat,HumanTravel
{
    public void eat()
    {
        System.out.println("Human is eating");
    }
    
    public void travel()
    {
        System.out.println("Human is Traveling");
    }
}


public class MultipleInhert {
    public static void main(String args[])
    {
        Human obj=new Human();
        obj.travel();
        obj.eat();
        
    }
    
}
