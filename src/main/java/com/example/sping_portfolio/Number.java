package com.example.sping_portfolio;

import java.util.ArrayList;
import java.lang.Math;
import java.util.HashMap;

// Write a Class Number
public class Number {

    static int squirrels;

    public Number() {
        squirrels = (int) (Math.random() * ( 36 - 3 + 1 ) + 3);

    }

    public static int getSquirrels(){
        return squirrels;

    }

    public static void main(String[] args){

        HashMap<Integer, String> index = new HashMap<Integer, String>();
        ArrayList<Integer> squirrelArray = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            Number number = new Number();
            int squirrelN = number.getSquirrels();
            // System.out.println(squirrelN);
            squirrelArray.add(squirrelN);
            index.put(squirrelN, Integer.toString(i));

        }

        // sort:
        int temp;

        for(int j = 0; j < squirrelArray.size() - 1; j++) {
            for (int i = 1; i < 10; i++) {
                if (squirrelArray.get(i) < squirrelArray.get(i - 1)) {
                    temp = squirrelArray.get(i);
                    squirrelArray.set(i, squirrelArray.get(i - 1));
                    squirrelArray.set(i - 1, temp);
                }
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.print("Squirrels: " + squirrelArray.get(i) + " ");
            System.out.println("Days: " + index.get(squirrelArray.get(i)));

        }

    }

}