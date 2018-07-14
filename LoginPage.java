import java.sql.Driver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		String key="webdriver.gecko.driver";
		String value ="./drivers/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver d1 = new FirefoxDriver();
		d1.get("https://www.jabong.com/");
		Thread.sleep(2000);
		d1.findElementById("signin-model-wishlist").click();
		Thread.sleep(2000);
		d1.findElementById("login-email").sendKeys("Test1212rs@gmail.com");
		d1.findElementById("login-pwd").sendKeys("Test@1234");
		d1.findElementById("btn-login").click();
		

	}

}
