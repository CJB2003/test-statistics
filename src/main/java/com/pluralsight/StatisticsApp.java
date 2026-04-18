package com.pluralsight;
import java.util.*;
import java.util.Arrays;

public class StatisticsApp {
    public static void main(String[] args) {

        //created array variable testScores with a fixed size of 10 but no numbers yet
        int[] testScores = new int[10];

        //Iterates the length of the empty array testScores and stores a random value into every index
        for (int i = 0; i < testScores.length; i++) {

            //Kept getting the numbers above 100, realized you have to multiply by max - min + 1
            //which is how I got 31 and add 70 for the min
            int randomScores = (int)(Math.random() * 31) + 70;
            testScores[i] = randomScores;
        }
        //prints the array in array format
        System.out.println(Arrays.toString(testScores));

        //Initialized variables with default values to calculate total score and average score
        double sumScores = 0;
        double avgScores = 0;

        //using for loop to iterate through the array and printing out all the values
        for (int testScore : testScores) {
            System.out.println(testScore);
            sumScores += testScore;
            avgScores = sumScores / 10;
        }
        System.out.println("Total: " + sumScores);
        System.out.println("The average score of the class is: " + avgScores);
    }

}
