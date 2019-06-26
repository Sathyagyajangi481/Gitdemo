package java_programs;

public class fibnachi_series {

	public static void main(String[] args) {
		
		int a=2; int b=4;
		
		for(int i=1;i<=8;i++)
		{
			System.out.print(a +" ");
		
		int sum=a+b;
		a=b;
		b=sum;
		}
		

	}

}
