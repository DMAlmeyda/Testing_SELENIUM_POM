package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends Base{
	By CreateAccountLink = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
	By CreateAccountTittle = By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span");
	By FirstName = By.xpath("//*[@id=\"firstname\"]");
	By LastName = By.xpath("//*[@id=\"lastname\"]");
	By Email = By.xpath("//*[@id=\"email_address\"]");
	By Password = By.xpath("//*[@id=\"password\"]");
	By ConfirmPass = By.xpath("//*[@id=\"password-confirmation\"]");
	By btnCreateAccount = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");
	By confirmMessage = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	
	public void registerUser(String name, String lastname, String email, String password) throws InterruptedException {
		click(CreateAccountLink);
		Thread.sleep(2000);
		if(isDisplayed(CreateAccountTittle)) {
			type(name, FirstName);
			type(lastname, LastName);
			type(email, Email);
			type(password, Password);
			type(password, ConfirmPass);
			
			click(btnCreateAccount);
		}else {
			System.out.println("Register page does't work :c");
		}
	}
	
	public Boolean ConfirmRegister() {
		return isDisplayed(confirmMessage);
	}
	
	
}
