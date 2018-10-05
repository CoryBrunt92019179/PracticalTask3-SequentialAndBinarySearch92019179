/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchassessment;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

/**
 *
 * @author 92019179
 */
public class SearchAlgorithms {

    public static int counter = 0;

    public static ArrayList<String> aL = new ArrayList();

    public static boolean contains(String term, String[] collection) {
        return (index1(term, collection) != -1);
    }

// Index1 is a BinarySearch that looks through the file asked.
    public static int index1(String term, String[] collection) {
        counter = 0;
        counter++;
        int size = collection.length;
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            counter++;
            if (collection[mid].equalsIgnoreCase(term)) {
                return mid;
            }
            counter++;
            if (collection[mid].compareToIgnoreCase(term) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

// index2 is the linerSearch/sequentialSearch that looks through the file asked.
    public static int index2(String term, String[] collection) {
        counter = 0;
        int size = collection.length;
        counter++;
        for (int i = 0; i < size; i++) {
            counter++;
            if (collection[i].equalsIgnoreCase(term)) {
                return i;
            }
        }

        return -1;

    }

// doSearch method has a if statment that looks if contain() has returned true and prints out moive postion, opeations, and time taken. for index1 and 2.
    public static void doSearch(String term, String[] list) {
        if (contains(term, list)) {
            long startTime = System.nanoTime();
            System.out.println("Binary Search");
            System.out.println("Searching:" + term);
            System.out.println("found " + "[" + term + "]" + " at postion  " + index1(term, list) + " of " + (list.length + +1));
            System.out.println("operations: " + counter);
            long endTime = System.nanoTime();
            long duration1 = ((endTime - startTime) / 1000000);
            System.out.println("Time: " + duration1 + " milliseconds");
            System.out.println("");

            long startTime2 = System.nanoTime();
            System.out.println("Liner Search");
            System.out.println("Searching:" + term);
            System.out.println("found " + "[" + term + "]" + " at postion  " + index2(term, list) + " of " + (list.length + +1));
            System.out.println("operations: " + counter);
            long endTime2 = System.nanoTime();
            long duration2 = ((endTime2 - startTime2) / 1000000);
            System.out.println("Time: " + duration2 + " milliseconds");
        } else {
            System.out.println("The search did not found your movie. ");
        }
    }

//obtainData takes the path of txt file we are looking at and turns it to an array.
    public static void obtainData(String path) {

//Use path to the ListOfPatients.txt here
        LineNumberReader lr = null;
//allows to read information from the file line by line
        String oneRecord;
        try {
//using try-catch for exception handling to catch
//possible errors with i/o operations
            FileReader inputStream = new FileReader(path);
//FileReader reads the file’s contents
            lr = new LineNumberReader(inputStream);
            while ((oneRecord = lr.readLine()) != null) {
                aL.add(oneRecord); //adding patient to the ArrayList
            }
        } catch (IOException ioe) {
            System.out.println("IOExcception occured");
        }
    }

// the main method prints out and the txt file we yyour using and the title we are looking up.
    public static void main(String[] args) {

        try {

            obtainData("src/searchassessment/movieTitles100.txt");
            String[] list = aL.toArray(new String[0]);
            String term = "Born Wild";
            System.out.println("==== 100 Movies ====");
            doSearch(term, list);

            obtainData("src/searchassessment/movieTitles100K.txt");
            list = aL.toArray(new String[0]);
            term = "The Leak";
            System.out.println("\n\n==== 100k Movies ====");
            doSearch(term, list);

            obtainData("src/searchassessment/movieTitles400K.txt");
            list = aL.toArray(new String[0]);
            term = "The Superstar";
            System.out.println("\n\n==== 400k Movies ====");
            doSearch(term, list);

        } catch (java.lang.IllegalArgumentException e) {
            System.out.println(e + ": Incorrect data file as argument: " + args[1]);
        }

    }
}
