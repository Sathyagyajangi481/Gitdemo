package java_programs;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.jna.platform.win32.OaIdl.DATE;

import freemarker.template.SimpleDate;

public class LeapYear {

	public static void main(String[] args) 
	{
		
	int year=3000;
	
	boolean leap=false;
	
	if(year%4==0)
	{
	
		if(year%100==0)
		{
			//for century years like 2000 it must divide with 400

			if(year%400==0)
			{
				System.out.println(year +" its a leap year ");
			}
			else
			{
				System.out.println(year +" its not a leap year");
			}
			
		}
		else
		{
			System.out.println(year +" its a leap year");
		}
		
		
		
	}
	else
	{
		System.out.println(year +" its not a leap year");
	}
	
	
		
	
	
	}
	

}
