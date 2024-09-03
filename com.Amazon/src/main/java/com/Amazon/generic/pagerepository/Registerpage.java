package com.Amazon.generic.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	
	public Registerpage(WebDriver driver) {
		
	  PageFactory.initElements(driver, this);
	}
	//1.Address of name textfeild
	@FindBy(id="name")
    private WebElement nameTextfield1;
	
	public WebElement getNameTextfield() {
		return nameTextfield1;
	}

	//2.Address of email textfeild
	@FindBy(id="email")
	 private  WebElement emailTextfield;

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	//3.Address of password textfeild
	@FindBy(id="password")
	private  WebElement pwdTextfield;
	public WebElement getPwdTextfield() {
		return pwdTextfield;
	}
     
	//4.Address of mobile textfeild
	@FindBy(id="mobile")
    private  WebElement mobileTextfield;
	public WebElement getMobileTextfield() {
		return mobileTextfield;
	}
	
		
 
	

}
