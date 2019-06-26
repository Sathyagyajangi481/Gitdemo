package java_programs;

public class primr1 {

	public static void main(String[] args) 
	{
		
	int year =3000;
	
	if(year%4==0)
	{
	if(year%100==0)
	{
		if(year%400==0)
		{
			if(year%100==0)
			{
				System.out.println(year +"its a leap year");
			}
		else
		{
			System.out.println(year +"its not a leap year");
		}
		}
		else
		{
			System.out.println(year +"its  a leap year");
		}
		System.out.println(year +"its a leap year");
	}
		
		
		
		
		System.out.println("its a leap year");
		
	}
	else 
	{
		System.out.println("its not a leap year");
	}

	}

}
