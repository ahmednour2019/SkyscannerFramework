package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static WebDriver driver;
	protected static Properties prop;
	
	@BeforeTest
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed2014\\eclipse-workspace\\aaaa\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		prop= new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\ahmed2014\\eclipse-workspace\\aaaa\\src\\main\\java\\config\\ahmedconfig");
		prop.load(ip);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	

}
