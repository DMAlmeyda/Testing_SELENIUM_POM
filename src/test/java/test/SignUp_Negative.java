package test;
import com.project.pom.SignUpPage;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignUp_Negative {
	private WebDriver driver;
	SignUpPage sup;

	@Before
	public void setUp() throws Exception {
		sup = new SignUpPage(driver);
		driver = sup.chromeDriverConnection();
		sup.visit("https://magento.softwaretestingboard.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

	@Test
	public void empyfield() throws InterruptedException {
		//BR1 and BR2
		Thread.sleep(3000);
		sup.registerUser("", "", "", "", "");
		Thread.sleep(3000);
		assertEquals(false ,sup.ConfirmRegister());
	}

	@Test
	public void InvalidEmail() throws InterruptedException {
		//BR3
		Thread.sleep(3000);
		sup.registerUser("Luke", "Glanton", "Luke#outlook.com", "LukeHansome1.", "LukeHansome1.");
		Thread.sleep(3000);
		assertEquals(true, sup.InvalidEmail());
		assertEquals(false ,sup.ConfirmRegister());

	}


	@Test 
	public void EmailAlreadyExist() throws InterruptedException { 
		//BR4
		Thread.sleep(3000); 
		sup.registerUser("Luke", "Glanton", "LukeGLAN@fake.com", "LukeHandsome123.", "LukeHandsome123."); 
		Thread.sleep(3000);
		assertEquals(true, sup.SameEmail()); 
		assertEquals(false,sup.ConfirmRegister());

	}


	@Test
	public void invalidPasswoord() throws InterruptedException {
		//BR5
		Thread.sleep(3000);
		sup.registerUser("Luke", "Glanton", "Luke123@fake.com", "Luke4.", "Luke4");
		Thread.sleep(3000);
		assertEquals(true, sup.Invalidpass());
		assertEquals(false, sup.ConfirmRegister());
	}

	@Test
	public void pass_need_3_typeofch() throws InterruptedException {
		//BR6
		Thread.sleep(3000);
		sup.registerUser("Luke", "Glanton", "Luke123@fake.com", "lukeglanton3", "lukeglanton3");
		Thread.sleep(3000);
		assertEquals(true, sup.pass_with_less3_types_ch());
		assertEquals(false, sup.ConfirmRegister());
	}

	@Test
	public void pass_need_to_be_same() throws InterruptedException {
		//BR7
		Thread.sleep(3000);
		sup.registerUser("Luke", "Glanton", "Luke123@fake.com", "Lukeglanton3", "lukeglanton3");
		Thread.sleep(3000);
		assertEquals(true, sup.DiferentPassValues());
		assertEquals(false, sup.ConfirmRegister());
	}



}


