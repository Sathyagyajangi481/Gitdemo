package java_programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class read_text_line_byl_ine {

	public static void main(String[] args) throws Throwable 
	{
		
	FileReader fr= new FileReader("D:\\Sathya\\StockAccounting\\ConfigFile\\4x Paypal Free.txt");
	
	BufferedReader br= new BufferedReader(fr);
	StringBuffer str= new StringBuffer();
	int n=str.length();

while(br.readLine()!=null)	
	{
		str=str.append(br.readLine());
	}
	
	System.out.println(str + " ");
	
	}

}
