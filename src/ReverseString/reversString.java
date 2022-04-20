package ReverseString;

public class reversString {

	public static void main(String[] args) 
	{
		// FIRST WAY ==> using concatination operator
		String str = "ABCD";
		String rev = "";
		
	/*	int len = str.length();
		
		for (int i = len-1; i >= 0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reversed String is : " + rev);
		
		
		
		// SECOND WAY ==> using charactor array
		
		char ar [] = str.toCharArray();
		
		int len = str.length();
		
		for (int  i =len-1; i>=0; i --)
		{
			rev = rev + ar[i];
		}
		System.out.println("This is second way of reversing the string : " + rev);
		
		*/
		
		
		// THIRD WAY ==> 	using String buffer class
		
		StringBuffer bf = new StringBuffer (str);
		 System.out.println(bf.reverse());

		
	}

}
