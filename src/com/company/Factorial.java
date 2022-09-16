package com.company;
import java.util.Scanner;
public class Factorial
{
    public Factorial()
    {
        System.out.println("\t\t|------------------------------------------------------|");
        System.out.println("\t\t|         You Have chosen Factorial Calculator         |");
        System.out.println("\t\t|------------------------------------------------------|");

        Scanner input = new Scanner(System.in);
            System.out.print("\t\t\t Enter Your Number------>");

            int i,fact=1;
            int number= input.nextInt();
            for(i=1;i<=number;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
    }
}



