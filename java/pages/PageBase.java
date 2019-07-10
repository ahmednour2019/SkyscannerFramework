package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;



public class PageBase {
	
	protected  WebDriver driver;

	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	
}

