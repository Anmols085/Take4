package com.sin.edx;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EdxLoginPage extends EdxBasePage{
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/h2")
		WebElement heading;
	@FindBy(id ="login-email")
		WebElement loginText;
	@FindBy(id = "login-password")
		WebElement passwordText;
	@FindBy(css = "#login > button")
		WebElement loginBtn;
	@FindBy(className = "message-title")
		WebElement failedLoginMessage;
	
	public String verifyNavigation() {
		return heading.getText();
	}
	public void enterID(String id) {
		loginText.sendKeys(id);
	}
	public void enterPassword(String password) {
		passwordText.sendKeys(password);
	}
	public void clickSigninBtn() {
		loginBtn.click();
	}
	public String verifyLoginFailure() {
		return failedLoginMessage.getText();
	}
}
