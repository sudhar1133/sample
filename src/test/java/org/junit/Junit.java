package org.junit;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.maven.BaseSudhar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Junit extends BaseSudhar{
	
 @Test
 public void Iphonelist() throws InterruptedException {

	 launchBrowser();
	 launchUrl("https://www.amazon.in/");
	 
	 PojoBase p = new PojoBase();
	 
	 toFillInput(p.getSearch(), "iphone");
	 
	 toClick(p.getSclick());
	 
	 List<WebElement> price = driver.findElements(By.className("a-price-whole"));
	 
	 Set<WebElement> set = new HashSet<WebElement>(price);
	 
	 for (WebElement t : set) {
		 
		 String text = t.getText();
		 System.out.println(text);
		
	}
	 
	 
 } 

}
