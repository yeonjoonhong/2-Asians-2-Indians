package com.example.sping_portfolio;
import java.util.ArrayList;
import java.lang.Math;
import java.util.HashMap

// Write a Class Number
public class Number {
    // instance variables

    double squirrels;
    int randNum;
    HashMap<Integer, Integer> originalIndex = new HashMap<Integer, Integer>();

    // It initializes a random number between 3 and 36, ie the number of squirrels in class

    public Number() {

        squirrels = Math.random();
        randNum = (int) squirrels * 36;

    }
    public static void main(String[] args) {

        ArrayList<Number> squirrels = new ArrayList<Number>();

        for(int i = 0; i < 10; i++){

        }

        ArrayList<Number> index = new ArrayList<Number>();

        Squirrel1 =
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops

        // My notes, sort array list and iterate through array list and find key associated with the number on hashmap
        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop

        for(int i = 0; i < 10; i++){
            System.out.print("Squirrels: " + squirrels.get(i) + " ");
            System.out.println("Days: " + index.get(i));

        }

    }

}