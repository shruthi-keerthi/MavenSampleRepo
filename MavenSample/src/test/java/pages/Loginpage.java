package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import runnerclass.ObjectRepo;

public class Loginpage extends ObjectRepo {
	public void loginpageAssertion() {
		Assert.assertEquals("Login | Tu clothing", driver.getTitle());
	}

	public void username() {
		driver.findElement(By.cssSelector("#j_username")).sendKeys("testmail@gmail.com");
	}

	public void password() {
		driver.findElement(By.cssSelector("#j_password")).sendKeys("test@123");
	}

	public void loginbutton() {
		driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary.tuButton.loginButtonMain.js-login-button"))
				.click();
	}

	public void username(String name) {
		driver.findElement(By.cssSelector("#j_username")).sendKeys(name);
	}

	public void password(String pass) {
		driver.findElement(By.cssSelector("#j_password")).sendKeys(pass);
	}
}
