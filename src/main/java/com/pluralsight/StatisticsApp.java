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
//        //Sorting the test scores lowest to highest
//        Arrays.sort(testScores);
        //prints the array in array format, some prints as well
        System.out.println("\t -| Here are the test scores |-");
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(testScores) + "\n");

        //initializing two variables, one for high and one for low score, set values to default
        int highScore = testScores[0];
        int lowScore = testScores[0];

        for (int i = 0; i < testScores.length; i++) {

            //If score at index of testScore is higher than variable highScore
            //Replace it with that score
            if (testScores[i] > highScore) {
                highScore = testScores[i];
            }
            //vice versa for to get the lowest score
            if (testScores[i] < lowScore) {
                lowScore = testScores[i];
            }
        }
        System.out.println("The highest score in the class is: " + highScore);
        System.out.println("The lowest score in the class is: " + lowScore);

        //Initialized variables with default values to calculate total score and average score
        double sumScores = 0;
        double avgScores = 0;

        //using enhanced for loop to iterate through the array and printing out all the values
        for (int testScore : testScores) {
            sumScores += testScore;
            avgScores = sumScores / 10;
        }
        System.out.println("\nTotal: " + sumScores);
        System.out.println("The average score of the class is: " + avgScores + "\n");

        //So in order to find the median value, we first need to sort the array
        Arrays.sort(testScores);

        //After we've sorted our array, since this is an even numbered array of 10
        //we'll get the two middle numbers which are 5 and 6 and find the average between them
        //to get the median value
        int medianValue = (testScores[4] + testScores[5]) / 2;
        System.out.println("The median value of the test scores is: " + medianValue);
    }

}
