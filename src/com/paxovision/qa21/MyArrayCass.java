package com.paxovision.qa21;



public class MyArrayCass {

	public static void main(String []args){
		 int i, j;

		    System.out.print("Countdown\n");

		    int[] numIndex = new int[10]; 
		   for (i = 0; i<10 ; i++) {  
		      numIndex[i] = i;
		      System.out.println(i);
		    }

		    for (j=9; j>=0; j--){ 
		      System.out.println(numIndex[j]);
		    } 
		

	}
}

