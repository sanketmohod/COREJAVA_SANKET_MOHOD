package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {
      // Armstrong number - the sum of cube of digit is equal to same number
	  // eg. 123 - 1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36 - which is not Armstrong number
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int module;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number : ");
        int n = Integer.parseInt(br.readLine());
        int number = n;
        int result = 0;
        while(number != 0) {
        	module = number % 10;
        	result = result + (module*module*module);
        	number = number / 10;
        }
        if(result == n) {
        	System.out.println("Entered number is armstrong.");
        }
        else
        {
        	System.out.println("Entered number is not armstrong.");
        }
	}

}
