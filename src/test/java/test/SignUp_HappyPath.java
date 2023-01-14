package test;
import com.project.pom.SignUpPage;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignUp_HappyPath {
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
	public void test() throws InterruptedException {
		sup.registerUser("Luke", "Glanton", "LukeGLANT@fake.com", "LukeHandsome123.", "LukeHandsome123.");
		Thread.sleep(2000);
		assertEquals(true, sup.ConfirmRegister()); 
	}

}
