package ReverseString;

public class reverseStringPractice {

	public static void main(String[] args) 
	{
		String afg = "Afghanistan";
		 int len = afg.length();
		 
		String  rev = "";
		
		for (int i = len-1; i >= 0; i --)
		{
			rev = rev + afg.charAt(i);
		}
		
		System.out.println(rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String str = "Afghanistan";
		String rev = "";
		int len = str.length();
		for (int i = len-1; i >= 0 ; i --)
		{
			rev = rev + str.charAt(i);
			
		}
		System.out.println(str);
		System.out.println(rev);

		
		int len = str.length();
		
		for (int i = len -1; i >=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		
		
		StringBuffer bf = new StringBuffer(str);
		StringBuffer dd = bf.reverse();
		System.out.println(dd);
		
		
		
		String str1 = "iran";
		String rev1 = "";
		int len = str1.length();
		for (int i = len-1; i >= 0; i --)
		{
			rev1 = rev1 + str1.charAt(i);
		}
		System.out.println(rev1);
		
		
		
		StringBuffer sb = new StringBuffer (str);
		System.out.println(sb.reverse());
		*/
	}
	
	
	

}
