package com.company;
import  java.util.*;
public class InchMeter {


    public InchMeter(){
        String inch="";
        String km="";
        double inch1=0;
        double km1;
        int choice = 0;
        boolean run;
        Scanner input=new Scanner(System.in);

        do {
            System.out.println("\t\t\t|-----------------------------|");
            System.out.println("\t\t\t|        Enter Option         |");
            System.out.println("\t\t\t|-----------------------------|");
            System.out.println("\t\t\t|1. Inch To Millimeter        |");
            System.out.println("\t\t\t|2. Kilometer To Meter        |");
            System.out.println("\t\t\t|-----------------------------|");
            if (choice <1 ||choice>2){
                System.out.println("Wrong Choice---- Please Choice 1-2. ");
            }

            System.out.print("Please Select Option--->");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("You have chosen Inch to Millimeter  Calculator");
                do {
                    try {
                        System.out.print("Enter value of inch---->");
                        inch = input.nextLine();
                        inch = input.nextLine();
                        inch1 = Double.parseDouble(inch);
                        run = false;
                        double result = inchToMetter(inch1);// passing user input and stroing  result into (result variable)
                        System.out.println("You have entered:" + inch + "Inch" + " " + "=" + " " + "Millimeter:" + result);
                    } catch(NumberFormatException numberFormatException){
                        System.out.println("Invalid Input... Please Try Again:");
                        run = true;
                    }

                } while (run);
            }

            if (choice == 2) {
                System.out.println("You have chosen Kilometer to meter  Calculator");
                do {
                    try {
                        System.out.print("Please Enter Kilometer value --->");
                        km = input.nextLine();
                        km = input.nextLine();
                        km1 = Double.parseDouble(km);
                        double kilometer = kmToMeter(km1);
                        System.out.println("[" + km1 + "]" + "Kilometer" + " " + "=" + kilometer + " " + "meters");
                        run = false;
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Invalid Input Please Try again");
                        run = true;
                    }
                } while (run);
            }
        }while (choice<1 || choice>2);

    }



    public  double inchToMetter( double in){
        double millimeter= in*25.4;
        return millimeter;
    }

    public  double kmToMeter( double km){

        double meter=km*1000;
        return meter;
    }

}
