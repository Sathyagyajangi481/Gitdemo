package java_programs;

public class palindrome {

	public static void main(String[] args) 
	{
		int sum=0,r, temp;
		int n=767;
		
		temp=n;
		while(n>0)
		{
			r=n%10;
			
			sum=(sum*10)+r;
			
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
