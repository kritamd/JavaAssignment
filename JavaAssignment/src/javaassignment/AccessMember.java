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
public class AccessMember {
    public static void main (String args[])
    {
        Adder obj=new Adder();
        obj.getdata(4,5);
        obj.add();
    }

}

class Adder
{
        int a,b,c;
    void getdata(int x,int y)
    {
        a=x;
        b=y;
    }
    
    void add()
    {
        c=a+b;
        System.out.println("Additon:" + c);
    }
}
