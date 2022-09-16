package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class NormalCalculator {

    String x, y;
    double x1,y1;
    int choice;
    double ans=0;



    NormalCalculator(){

        System.out.println("\t\t\t|----------------------------------|");
        System.out.println("\t\t\t|You Have chosen Normal Calculator |");
        System.out.println("\t\t\t|----------------------------------|");

        Scanner input= new Scanner(System.in);
        boolean the_condition=false;// as we  know that , if loop need to run the while condition must be (true)
        // and if need exit from loop the while condition must be (false);
        do {
            System.out.print("\t\t\t Enter First Number------>");
            try {
                x=input.nextLine();
                x1=Double.parseDouble(x);
                the_condition=false; //
            } catch( InputMismatchException inputMismatchException){
                System.out.println("\t\t\tInvalid Input");
                the_condition=true;
            }

        } while(the_condition );

        boolean the_condition2=false;
        do {
            try {
                System.out.print("\t\t\t Enter Second Number----->");
                y=input.nextLine();
                y1=Double.parseDouble(y);
                the_condition2=false;
            }catch (InputMismatchException inputMismatchException){
                System.out.println("\t\t\tInvalid Input ");
                the_condition2=true;
            }
        } while( the_condition2);

        do {
            System.out.println("\t\t\t|---------------------------------|");
            System.out.println("\t\t\t| Choice Option from list         |");
            System.out.println("\t\t\t| 1. Addition                     |");
            System.out.println("\t\t\t| 2. Subtraction                  |");
            System.out.println("\t\t\t| 3. Multiplication               |");
            System.out.println("\t\t\t| 4. Division                     |");
            System.out.println("\t\t\t|---------------------------------|");


            choice=input.nextInt();
            if (choice==1){
                System.out.println(ans=Add(x1,y1));
                the_condition=false;
            }
            if (choice==2){
                System.out.println(ans=Sub(x1,y1));
                the_condition=false;
            }

            if (choice==3){
                System.out.println(ans=Multi(x1,y1));
                the_condition=false;
            }

            if (choice==4){
                System.out.println(ans=Div(x1,y1));
                the_condition=false;
            }

        }while (the_condition);


    }

    /**
     *
     * @param a taking a double  type number from user
     * @param b another number taking from user to add with the first number
     * @return return the value after adding two numbers .
     */

    public double Add(double a, double b){
        double ans=a+b;
        return ans;
    }

    public double Sub( double a, double b){
        double ans=a-b;
        return ans;
    }

    public  double Multi( double a , double b){
        double ans=a*b;
        return ans;

    }

    public double Div( double a, double b){
        double ans=a/b;
        return ans;
    }

}
