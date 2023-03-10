package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends Base{
	private By CreateAccountLink = By.linkText("Create an Account");
	private By CreateAccountTittle = By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span");
	private By FirstName = By.id("firstname");
	private By LastName = By.id("lastname");
	private By Email = By.id("email_address");
	private By Password = By.id("password");
	private By ConfirmPass = By.id("password-confirmation");
	private By btnCreateAccount = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");
	private By confirmMessage = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
	private By invalidemail = By.id("email_address-error");
	private By shortpass = By.id("password-error");
	private By pass_with_less_3ch = By.id("password-error");
	private By differentfpassvalue = By.id("password-confirmation-error");
	private By same_email_user = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div");
	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	public void registerUser(String name, String lastname, String email, String password,String confirmpass) throws InterruptedException {
		click(CreateAccountLink);
		Thread.sleep(2000);
		if(isDisplayed(CreateAccountTittle)) {
			type(name, FirstName);
			type(lastname, LastName);
			type(email, Email);
			type(password, Password);
			type(confirmpass, ConfirmPass);
			click(btnCreateAccount);
		}else {
			System.out.println("Register page does't work :c");
		}
	}

	public Boolean ConfirmRegister() {
		return isDisplayed(confirmMessage);
	}

	public Boolean InvalidEmail() {
		return isDisplayed(invalidemail);
	}

	public Boolean Invalidpass() {
		return isDisplayed(shortpass);
	}

	public Boolean pass_with_less3_types_ch() {
		return isDisplayed(pass_with_less_3ch);
	}

	public Boolean DiferentPassValues() {
		return isDisplayed(differentfpassvalue);
	}

	public Boolean SameEmail() {
		return isDisplayed(same_email_user);
	}






}
