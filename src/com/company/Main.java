package com.company;

import java.util.Scanner;

public class Main {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.SortedSet<String> sets = new java.util.TreeSet<String>();
        for (int i = 0; i <= s.length() - k; i++) {
            sets.add(s.substring(i, i + k));
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = sets.first();
        largest = sets.last();
        return smallest + "\n" + largest;
//        return sets.toString();
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
