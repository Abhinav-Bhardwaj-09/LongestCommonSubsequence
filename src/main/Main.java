package main;

import lcs.LCS;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 17-12-2020
 * Time: 22:38
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the first String :-  ");
        String s1 = sc.next();
        System.out.println();
        System.out.print("Enter the second String :-  ");
        String s2 = sc.next();
        System.out.println("\n");
        LCS lcs = new LCS();
        lcs.lcs(s1,s2);
    }
}
