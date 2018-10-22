package runnerclass;

import org.openqa.selenium.WebDriver;

import pages.Homepage;
import pages.Loginpage;

public class ObjectRepo {
	public static WebDriver driver;
	public static Homepage homepage = new Homepage();
	public static Loginpage loginpage = new Loginpage();
}
