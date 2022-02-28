package com.example.sping_portfolio;

import java.util.Scanner;

public class FRQ10Model extends NumberSystem{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("input 2 numbers separated by a space: ");

        String[] ab = scan.nextLine().split(" ");

        System.out.println("Do you want to");
        System.out.println("1. Find the gcf of the two numbers");
        System.out.println("2. Calculate the fraction of first number/second number");

        int oneTwo = scan.nextInt();

        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        if(oneTwo == 1){
            System.out.println("Gcf: " + gcf(a,b));
        }
        else if (oneTwo == 2) {
            System.out.println(reducefraction(a, b));
        }
        else {
            System.out.println("please input 1 or 2");
        }

        System.out.println();
        main (null);

    }


}

