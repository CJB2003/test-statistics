package com.pluralsight;
import java.util.Arrays;

public class StatisticsApp {
    public static void main(String[] args) {

        //created array variable testScores and store the array method getScores() in there
        int[] testScores = getScores();

        //using for loop to iterate through the array and printing out all the values
        for (int i = 0; i < testScores.length; i++) {
            System.out.println(testScores[i] + " ");
        }
        System.out.println();
    }
    //array method storing 10 test score values
    public static int[] getScores() {
        int[] testNums = {90, 85, 82, 80, 95, 99, 76, 50, 65, 75};
        return testNums;
    }
}
