package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import runnerclass.ObjectRepo;

public class Homepage extends ObjectRepo {

	public void home() {
		driver.get("https://tuclothing.sainsburys.co.uk/");
	}

	public void loginlink() {
		driver.findElement(By.cssSelector("a[href='/login']")).click();
	}

	public void homepageAssertion() {
		Assert.assertEquals("Womens, Mens, Kids & Baby Fashion | Tu clothing", driver.getTitle());
	}

}
