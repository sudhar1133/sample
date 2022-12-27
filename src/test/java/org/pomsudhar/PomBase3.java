package org.pomsudhar;

import org.maven.BaseSudhar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomBase3 extends BaseSudhar{
	
	public PomBase3() {

	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement rbtn;
	
	@FindBy(id="continue")
	private WebElement cbtn;
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccmnth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cccvv;
	
	@FindBy(id="book_now")
	private WebElement bookBtn;
	
	
	public WebElement getBookBtn() {
		return bookBtn;
	}

	public WebElement getRbtn() {
		return rbtn;
	}

	public WebElement getCbtn() {
		return cbtn;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmnth() {
		return ccmnth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getbBtn() {
		return bBtn;
	}

	@FindBy(id="book_now")
	private WebElement bBtn;

}
