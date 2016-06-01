package com.paxovision.qa21;

import java.util.Scanner;

public class FbuZZ1 {
	
	public static void main(String [] args){ 
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Input =");
		 
		int input = sc.nextInt();
		for(int i = 1; i <= input; i++) { 
			
			if(i % (3*5)==0) System.out.println("FizzBuzz"); 
			else if(i % 3 == 0) System.out.println("Fizz"); 
			else if(i % 5 == 0) System.out.println("Buzz"); 
			else System.out.println(i); 
			} 
		} 
}
