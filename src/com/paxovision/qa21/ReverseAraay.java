package com.paxovision.qa21;

import java.util.Scanner;

public class ReverseAraay {

	public static void main(String[] args) {

		String name = "HCET OXAP";

		for (int i = name.length()-1; i >= 0; i--) {
	
		System.out.print(name.charAt(i));
	
	}
	
		////////////////////////////////////////////
		/*String name1 = "CINILC TAEH HCET OXAP";
	char[] charArray = name1.toCharArray();
	for(int i = charArray.length-1; i>=0; i--){
		System.out.print( charArray[i]);
	}*/
	/////////////////////////////////////////////
	/* Scanner s = new Scanner(System.in);
     System.out.print("Enter the number to be reversed : ");
     int input = s.nextInt();
     int result = reverse(input);
     System.out.println("The reversed number is " + result);
	}

 public static int reverse(int n) {
     int result = 0;
     int rem;
     while (n > 0) {
         rem = n % 10;
         n = n / 10;
         result = result * 10 + rem;
     }
     return result;
	
*/	
}
 
}
