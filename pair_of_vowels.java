package com.akshat.string_programs;

//Doubt : Why Input with space gives wrong output. Input without space gives right output.

import java.util.Scanner;

public class pair_of_vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  // Initialize the Scanner Class

        System.out.println("Enter the String :");  // Ask for the input
        String str = sc.next();
        String strnew="";
        int len=str.length(),i;
        char ch,ch1;

        for (i=1;i<=len-1;i++)
        {
            ch=str.charAt(i-1);
            ch1=str.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                if (ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
                {
                    strnew = strnew + ch+ch1+"   ";  // Add to the new string
                }
            }
        }

        System.out.println("Pair of vowels in a String are : "+strnew);
    }
}
