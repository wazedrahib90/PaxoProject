package com.paxovision.qa21;

import java.util.Scanner;

public class EvenorOdd {

	public static void main (String[] args) {
		
		int num; 
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a number to check its Even or Odd"); 
		
		num = input.nextInt(); 
		
		System.out.println((num%2)==0 ? "even number":"odd number");

		 
	}

}
