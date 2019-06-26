package netflix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonFunctionLibrary.FunctionLibrary;

public class netflix {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis= new FileInputStream(".\\TestInputs\\netflix.xlsx");
		
		 Workbook wb=WorkbookFactory.create(fis);
		
		 Sheet sh= wb.createSheet();
		 
		int row = sh.getLastRowNum();
		 
		WebElement uid= driver.findElement(By.id("id_userLoginId"));
		
		WebElement pwd=driver.findElement(By.id("id_password"));
		for(int i=1;i<=row;i++)
			{
			
		String username=wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
		
		String pass=wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
		
		uid.sendKeys(username);
			pwd.sendKeys(pass);
			String actile=driver.getTitle();
			File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
			
			FileUtils.copyFile(scr, new File("./Screenshots/"+actile+"_"+FunctionLibrary.generatedate()+".jpg"));	
			
			
			
			}
		
		
	}

}
