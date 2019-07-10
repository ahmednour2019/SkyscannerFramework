package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id="fsc-origin-search")
	WebElement from_contry;
	
	@FindBy(id="fsc-destination-search")
	WebElement to_contry;
	
	@FindBy(xpath="//*[@id=\"flights-search-controls-root\"]/div/div/form/div[3]/button")
	WebElement SearchButon;
	
	
	
	public void SelectFromCtry(String country1)
	{
		from_contry.sendKeys(country1);
	}
	
	public void SelectToCtry(String country2)
	{
		to_contry.sendKeys(country2);
	}
	
	public void SelectFromDate(String date1,String date2) throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='depart-fsc-datepicker-button']"));
		Thread.sleep(2000);
		Select month= new Select(driver.findElement(By.name("months")));
		month.selectByVisibleText(date1);
		driver.findElement(By.xpath("//button[@aria-label='"+date2+"']"));
		
	}
	public void SelectToDate(String date3,String date4) throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='return-fsc-datepicker-button']"));
		Thread.sleep(2000);
		Select month= new Select(driver.findElement(By.name("months")));
		month.selectByVisibleText(date3);
		driver.findElement(By.xpath("//button[@aria-label='"+date4+"']"));
		
	}
	public void Submit()
	{
		SearchButon.click();
	}
	
	
	

}
