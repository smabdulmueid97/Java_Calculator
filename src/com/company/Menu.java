package com.company;
import  java.util.*;
public class Menu {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input;
        input = new Scanner(System.in);


        do {

            System.out.println("\t\t|------------------------------------------------------|");
            System.out.println("\t\t|               MultiCalculator                        |");
            System.out.println("\t\t|------------------------------------------------------|");
            System.out.println("\t\t|       Enter what would you like to Do:               |");
            System.out.println("\t\t|-------->1. Normal Calculator                         |");
            System.out.println("\t\t|-------->2. Inch To Millimeter Calculator             |");
            System.out.println("\t\t|-------->3. Binary Calculator                         |");
            System.out.println("\t\t|-------->4.Factorial Calculator                       |");
            System.out.println("\t\t|-------->5. Exist                                     |");
            System.out.println("\t\t|------------------------------------------------------|");
            System.out.println("\n");
            System.out.println("\t\t-------------------------------------------------------");
            System.out.print("\t\t        Select Your Option---------->  ");

            choice=input.nextInt();
            if (choice <1 || choice> 5){
                System.out.println("Invalid Choice. Please chose 1 - 5:");
            }

        }while (choice<1 || choice>5);

        switch (choice){

            case  1:
                System.out.println(" ");

                NormalCalculator normalCalculator=new NormalCalculator();
                break;
            case  2:
                System.out.println("This Calculator is To Calculate Inch-to-Meters ");
                InchMeter inchMeter=new InchMeter();
                break;
            case  3:
                System.out.println("This Is Binary Calculator");
                BinaryCalculator binaryCalculator= new BinaryCalculator();
                break;
            case  4:
                System.out.println("This Is Factorial Calculator");
                Factorial factorial=new Factorial();
                break;
            case  5:
                System.exit(0);


        }

    }

}
