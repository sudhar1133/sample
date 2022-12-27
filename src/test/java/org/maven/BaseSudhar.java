package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSudhar {
	
    public static WebDriver driver;
	
	public static Actions a;
	
	public static void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}
	
	public static void launchUrl(String url) {
		
		driver.get(url);
		
		driver.manage().window().maximize();
	}
	
	public static void browserClose() {

		driver.close();
	}
	
	public static void toFillInput(WebElement element, String input) {
		
		element.sendKeys(input);
	}
	
	public static void toClick(WebElement element) {
		
		element.click();
	}
	
	public static void title() {
        
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void url() {
        
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void pageSrc() {
         
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	public static void togetText(WebElement element) {
		
		String text = element.getText();
		System.out.println(text);
		
	}
	
	public static void togetAttribute(WebElement element) {
		
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
				
	}
	
	public static void toPerformMouseHover(WebElement element) {
    		
    		a = new Actions(driver);
    		
    		a.moveToElement(element).perform();
    		
		}
	
	public static void toPerformRightClick(WebElement element) {
		   
		   a.contextClick(element).perform();

	}
	
	public static void toPerformDoubleclick(WebElement element) {
          
		a.doubleClick(element).perform();
	}
	
	public static void navigation(String url) {
		
		driver.navigate().to(url);
		
	}
	
	public static void backurl() {
         
		driver.navigate().back();
	}
	
	public static void fronturl() {
         
		driver.navigate().forward();
	}
	
	public static void refresh() {
        
		driver.navigate().refresh();
	}
	
	public static void dropDown(WebElement element,int no) {
		
		Select s = new Select(element);
		s.selectByIndex(no);

	}
		
	public static void screenshot(String fileName) throws IOException {
       
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  
	  File dest = new File("D:\\ECLIPS\\Maven\\screenshotsudhar\\"+ fileName +".png");
	  
	  FileUtils.copyFile(src, dest);
	  	
	}
	
public static String excelData(int row, int cell) throws IOException {
		
		File f = new File("D:\\ECLIPS\\Maven\\Excel\\Sudhar.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Sheet1");
			
		Row r = s.getRow(row);	
				
		Cell c = r.getCell(cell);
				
		int cellType = c.getCellType();
				
				String Value;
				
				if (cellType==1) {
					
					Value = c.getStringCellValue();
				}
				
				else if (DateUtil.isCellDateFormatted(c)) {
					
					Date d = c.getDateCellValue();
					
					SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
					
					Value = sim.format(d);					
				}
				
				else {
					
					double n = c.getNumericCellValue();
					
					long l = (long) n;
					
					Value = String.valueOf(l);
					
				}
				return Value;
			}

     





}
			





