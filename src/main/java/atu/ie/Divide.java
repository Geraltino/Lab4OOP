package atu.ie;

import java.util.Scanner;

public class Divide {

    public static void main(String[] args){
        add();

    }

    public static void divide()
    {
        System.out.println("Please enter your first number :");
        Scanner inputs = new Scanner(System.in);
        int FirstNum = inputs.nextInt();

        System.out.println("Please enter your Second Number :");
        int SecondNum = inputs.nextInt();

        int total = FirstNum / SecondNum;
        System.out.println("The Total for Divison is " + total);
    }

    public static void delete()
    {

    }
}
