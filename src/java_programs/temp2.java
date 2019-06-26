package java_programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class temp2 {

	public static void main(String[] args) throws Throwable 
	{
		
		int x[]={12,14,12,67,78,67};
	
	for(int i=0;i<x.length;i++)
	{
		for(int j=i+1;j<x.length;j++)
		{
			if(x[i]!=x[j])
			{
				System.out.println(x[i]);
			}
		break;
		
		}
	}
	}
	

}
