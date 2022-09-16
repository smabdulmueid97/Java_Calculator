package com.company;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class BinaryCalculator
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\t\t|------------------------------------------------------------|");
        System.out.println("\t\t|         You Have chosen BinaryCalculator Calculator        |");
        System.out.println("\t\t|------------------------------------------------------------|");

        try (Scanner input = new Scanner(System.in))
        {
            BinaryCalculator2 operation = new BinaryCalculator2();
            System.out.print("First Binary:  ");
            String Number1 = input.next();
            System.out.print("Second Binary: ");
            String Number2 = input.next();
            System.out.println("Sum:"+ operation.Sum(Number1, Number2));
        }
        catch (NumberFormatException x)
        {
            System.out.println("Looks like you entered a non Binary digit.");
        } finally
        {
            in.close();
        }
    }
    public static class BinaryCalculator2
    {
        public String Sum(String a, String b)
        {
            int left = Integer.parseInt(a, 2);
            int right = Integer.parseInt(b, 2);
            int sum = left + right;
            return Integer.toBinaryString(sum);
        }
    }
}
