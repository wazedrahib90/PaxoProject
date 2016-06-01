package com.paxovision.qa21;
import java.util.Scanner;

public class OddorEven{
	public static void main(String [] args){
	System.out.println("Enter aninteger to check if it is odd or even ");
	Scanner in = new Scanner(System.in);

	x = in.nextInt();
	if(x % 2 == 0)
		System.out.println("You Enter An Even Number");

		else 
			System .out.println("You entered an odd number.");


	}
static int x;
	}