package com.paxovision.qa21;

public class NumberReverse {
    public int reverseNumber(int number){
        
        int rev = 0;
        while(number !=0){
            rev = (rev*10)+(number%10);
            number = number/10;
        }
		return rev;
        
    }
    
    public static void main(String[] arg) {
   	 NumberReverse nr = new NumberReverse();
        System.out.println("Result: "+nr.reverseNumber(15));
      
    	}

	}


