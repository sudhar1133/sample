package org.maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ResultsSudhar extends BaseSudhar{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchBrowser();
		launchUrl("https://adactinhotelapp.com/");
		
		WebElement user = driver.findElement(By.id("username"));
	    
		toFillInput(user, excelData(5, 1));
		
		WebElement pass = driver.findElement(By.id("password"));
		
		toFillInput(pass, excelData(5, 2));
		
		WebElement loginBtn = driver.findElement(By.id("login"));
		
		toClick(loginBtn);
		
		WebElement loc = driver.findElement(By.id("location"));
	
	    dropDown(loc, 2);
	    
	    WebElement selHotel = driver.findElement(By.id("hotels"));
	    
	    dropDown(selHotel, 1);
	    
	    WebElement room = driver.findElement(By.id("room_type"));
	    
	    dropDown(room, 3);
	    
	    WebElement qtyRoom = driver.findElement(By.id("room_nos"));
	    
	    dropDown(qtyRoom, 5);
	    
	    WebElement chekin = driver.findElement(By.id("datepick_in"));
	    
	    toFillInput(chekin, "10/12/2022");
	    
        WebElement chekout = driver.findElement(By.id("datepick_out"));
	    
	    toFillInput(chekout, "12/12/2022");
	    
	    WebElement qtyAdult = driver.findElement(By.id("adult_room"));
	    
	    dropDown(qtyAdult, 2);
	    
	    WebElement qtyChild = driver.findElement(By.id("child_room"));
	    
	    dropDown(qtyChild, 3);
	    
	    WebElement searchBtn = driver.findElement(By.id("Submit"));
	    
	    toClick(searchBtn);
	    
	    WebElement radio = driver.findElement(By.id("radiobutton_0"));
	    
	    toClick(radio);
	    
	    WebElement cnt = driver.findElement(By.id("continue"));
	    
	    toClick(cnt);
	    
	    screenshot("booking");
	    
	    WebElement firstName = driver.findElement(By.id("first_name"));
	    
	    toFillInput(firstName, excelData(6, 1));
	    
	    WebElement lastName = driver.findElement(By.id("last_name"));
	    
	    toFillInput(lastName, excelData(6, 2));
	    
	    WebElement add = driver.findElement(By.id("address"));
	    
	    toFillInput(add, excelData(6, 3));
	    
	    WebElement ccno = driver.findElement(By.id("cc_num"));
	    
	    toFillInput(ccno, excelData(5, 3));
	    
	    WebElement cctype = driver.findElement(By.id("cc_type"));
	    
	    dropDown(cctype, 3);
	    
	    WebElement expMnt = driver.findElement(By.id("cc_exp_month"));
	    
	    dropDown(expMnt, 5);
	    
	    WebElement expYear = driver.findElement(By.id("cc_exp_year"));
	    
	    dropDown(expYear, 8);
	    
	    WebElement cvv = driver.findElement(By.id("cc_cvv"));
	    
	    toFillInput(cvv, "123");
	    
	    WebElement bookBtn = driver.findElement(By.id("book_now"));
	    
	    toClick(bookBtn);
	    
	    Thread.sleep(8000);
	    
	    screenshot("order");
	    
	    WebElement order = driver.findElement(By.id("order_no"));
	    
	    togetAttribute(order);
	    
	    
	    
	   
	   
	    
	    
	    
	    

	    
	    
	    
	
	
	
	}
	
	
	

}
