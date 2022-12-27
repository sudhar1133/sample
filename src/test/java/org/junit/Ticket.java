package org.junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.maven.BaseSudhar;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Ticket extends BaseSudhar {

	@Test
	public void bookTicket() throws InterruptedException, AWTException {

		launchBrowser();

		launchUrl("https://www.makemytrip.com/flights/");
		
		//WebElement lbtn = driver.findElement(By.xpath("//p[text()='Login or Create Account']"));
		
		//toClick(lbtn);
		
		//WebElement from = driver.findElement(By.id("fromCity"));

		//toFillInput(from, "Chennai");

		//WebElement to = driver.findElement(By.id("toCity"));

		//toFillInput(to, "Bengaluru");

		//Robot r = new Robot();

		//r.keyPress(KeyEvent.VK_ESCAPE);
		//r.keyRelease(KeyEvent.VK_ESCAPE);

		//Thread.sleep(6000);

	//	WebElement sel = driver.findElement(By.xpath("(//p[text()='22'])[1]"));
		
		WebElement sbtn = driver.findElement(By.xpath("//a[text()='Search']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", sbtn);
		
		WebElement msg = driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']"));
		
		msg.click();


		//WebElement sbtn = driver.findElement(By.xpath("//a[text()='Search']"));

		//toClick(sbtn);

	}

}
