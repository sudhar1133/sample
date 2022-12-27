package org.pomsudhar;

import java.io.IOException;

import org.maven.BaseSudhar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PomResults extends BaseSudhar {
	

public static void main(String[] args) throws IOException, InterruptedException {
	
	 launchBrowser();
	 launchUrl("https://adactinhotelapp.com/");
	 
	 PomBase b = new PomBase();
	 
	 toFillInput(b.getUser(),excelData(5, 1));
	 
	 toFillInput(b.getPass(),"12345678");
	 
	 toClick(b.getLoginBtn());
	 
	 PomBase2 b2 = new PomBase2();
	 
	 dropDown(b2.getLocat(), 2);
	 
	 dropDown(b2.getSelhot(), 3);
	 
	 dropDown(b2.getTyperoom(), 2);
	
	  
	 dropDown(b2.getRoomqty(), 2);
	 
	 toFillInput(b2.getDatein(), "15/12/2022");
	 
	 toFillInput(b2.getDateout(), "17/12/2022");
	 
	 dropDown(b2.getAdroom(), 2);
	 
	 dropDown(b2.getChroom(), 2);
	 
	 toClick(b2.getSbtn());
	 
	 PomBase3 b3 = new PomBase3();
	 
	 toClick(b3.getRbtn());
	 
	 toClick(b3.getCbtn());
	 
	 toFillInput(b3.getFname(), "sudhar");
	 
	 toFillInput(b3.getLname(), "san");
	 
	 toFillInput(b3.getAddress(), "chennai");
	 
	 toFillInput(b3.getCcnum(), "1234567890123456");
	 
	 dropDown(b3.getCctype(), 3);
	 
	 dropDown(b3.getCcmnth(), 5);
	 
	 dropDown(b3.getCcyear(), 4);
	 
	 toFillInput(b3.getCccvv(), "123");
	 
	 toClick(b3.getBookBtn());
	 
	 Thread.sleep(8000);
	    
	  WebElement order = driver.findElement(By.id("order_no"));
	  String attribute = order.getAttribute("value");
	  System.out.println(attribute);
	    
	 
	 
	 
	 
	 
	 
		
	 
	 
	 
	 
}

}
