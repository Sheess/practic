package ReverseNumber;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) 
	{
		
		
		
		 // TYPE TEXT  (ENTER TEXT)
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt(); //1234
		
		/*
	=========================================================================================
		REVERSE THE NUMBER 
		 
		// (1). using algarithim
		
		int rev = 0;
		
		while (num!= 0 )
		{
			rev = rev *10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse Number is: " + rev);
		
		
		
		// (2) using String Buffer
		
		StringBuffer sb = new StringBuffer (String.valueOf(num)); // we conventing to String 
		StringBuffer rev = sb.reverse();  // here we store the reverse String into StringBuffer class
		System.out.println(rev);
		
		*/
		
		// (3) using the StringBuilder Class
		
		StringBuilder sbl = new StringBuilder ();
		sbl.append(num);   // we are adding the number append() is use for number in StringBuffer
		
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);
		
		
		
		
		
		
		
	}

}
