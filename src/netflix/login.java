package netflix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CommonFunctionLibrary.FunctionLibrary;
import Utilities.ExcelFileUtil;

public class login 
{
		static Workbook wb;
	public static void main(String[] args) throws Throwable 
	{
		
		
		FileInputStream fis= new FileInputStream("./TestInputs/netflix.xlsx"); 

			wb=WorkbookFactory.create(fis);
	
			Sheet sh1=	wb.getSheetAt(0);
		int row= sh1.getLastRowNum();
		System.out.println(row);
			for(int i=0;i<=row;i++)
			{
				System.setProperty("webdriver.chrome.driver","CommonJarFiles/chromedriver.exe" );
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.netflix.com/in/login");
				
				
				WebElement username= driver.findElement(By.id("id_userLoginId"));
				WebElement pwd=driver.findElement(By.id("id_password"));

				
				
				String	uid=sh1.getRow(i).getCell(0).getStringCellValue();
			String pawd= sh1.getRow(i).getCell(1).getStringCellValue();
		
			username.sendKeys(uid);
			
			pwd.sendKeys(pawd);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
			String actile=driver.getTitle();
			String exptile="Netflix";
			if(actile.equalsIgnoreCase(exptile))
			{
				File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("./Screenshots/"+actile+"_"+FunctionLibrary.generatedate()+".jpg"));	
			break;
			}
			driver.quit();
			}
		
	}

}
