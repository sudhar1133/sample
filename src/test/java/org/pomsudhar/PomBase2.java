package org.pomsudhar;

import org.maven.BaseSudhar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomBase2 extends BaseSudhar {
	
	
	public PomBase2() {

	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="location")
	private WebElement locat;
	
	@FindBy(id="hotels")
	private WebElement selhot;
	
	@FindBy(id="room_type")
	private WebElement typeroom;
	
	@FindBy(id="room_nos")
	private WebElement roomqty;
	
	@FindBy(id="datepick_in")
	private WebElement datein;
	
	@FindBy(id="datepick_out")
	private WebElement dateout;
	
	@FindBy(id="adult_room")
	private WebElement adroom;
	
	@FindBy(id="child_room")
	private WebElement chroom;
	
	@FindBy(id="Submit")
	private WebElement sbtn;

	public WebElement getLocat() {
		return locat;
	}

	public WebElement getSelhot() {
		return selhot;
	}

	public WebElement getTyperoom() {
		return typeroom;
	}

	public WebElement getRoomqty() {
		return roomqty;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdroom() {
		return adroom;
	}

	public WebElement getChroom() {
		return chroom;
	}

	public WebElement getSbtn() {
		return sbtn;
	}
	
	

	}
