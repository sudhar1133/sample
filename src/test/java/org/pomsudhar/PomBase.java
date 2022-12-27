package org.pomsudhar;

import javax.management.loading.PrivateClassLoader;

import org.maven.BaseSudhar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomBase extends BaseSudhar {
	
	public PomBase() {

	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement loginBtn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

}
