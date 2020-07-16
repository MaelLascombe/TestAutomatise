package sqli.df.tp.tp_test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitTest {
	private WebDriver driver;
	private String baseUrl;
	private String expectedTitle;

	@Before
	public void setUp() throws Exception {
		if(System.getProperty("os.name").toLowerCase().contains("win")) {
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		}else if(System.getProperty("os.name").toLowerCase().contains("nix") ||
				System.getProperty("os.name").toLowerCase().contains("nux") ||
				System.getProperty("os.name").toLowerCase().contains("aix")){
			System.setProperty("webdriver.gecko.driver","geckodriver");
		}else {
			System.out.println("Vendez votre Mac");
		}
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
		expectedTitle = "Google";
		baseUrl = "http://www.google.com";
		driver.get(baseUrl);
		driver.get("https://www.google.com");
		Assert.assertTrue("Title does match", expectedTitle.equals(driver.getTitle()));
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	public void configureFirefoxBrowser() {
		if(System.getProperty("os.name").toLowerCase().contains("win")) {
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		}else if(System.getProperty("os.name").toLowerCase().contains("nix") ||
				System.getProperty("os.name").toLowerCase().contains("nux") ||
				System.getProperty("os.name").toLowerCase().contains("aix")){
			System.setProperty("webdriver.gecko.driver","geckodriver");
		}else {
			System.out.println("Vendez votre Mac");
		}
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void navigateToGoogle() throws Exception {
		expectedTitle = "Google";
		baseUrl = "http://www.google.com";
		driver.get(baseUrl);
		driver.get("https://www.google.com");
	}

	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

	public void closeBrowser() {
		driver.close();
	}

}
