package com.paxovision.qa21;
public class Fbuzz {

	public static void main1(String[] args) {
		int count;
		
		 for( count = 1; count <= 10; count++)
            
		        System.out.print(count+ "--");

		        System.out.print(10);    
	}
	public static void main(String[] args) {

        for (int i = 1; i < 20; i++) {

            if (i % 3 == 0) {
                System.out.println(i + " = Fizz");
                
            } else if (i % 5 == 0) {
            	 System.out.println(i + " = Buzz");
            	 
            } else if (i % 3 == 0 && i % 5 == 0) {            	
                System.out.println(i + " = FizzBuzz");
            }

        }

    }
	

}
