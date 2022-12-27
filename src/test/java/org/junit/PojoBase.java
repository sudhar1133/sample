package org.junit;

import java.util.Date;

import org.maven.BaseSudhar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoBase extends BaseSudhar {
	
	public PojoBase() {

	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement sclick;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSclick() {
		return sclick;
	}
	
	
	
	

}
