package stepdef;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import runnerclass.ObjectRepo;

public class Hooks extends ObjectRepo {
	@Before
	public void start() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shruthi Keerthi\\eclipse-workspace\\MavenSample\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void close() {
		driver.close();
	}
}
