package tests;


import org.testng.annotations.Test;

import pages.HomePage;

public class SearchFlight extends TestBase{
	
	HomePage homepage;
	
	@Test
	public void SearchForTrip() throws InterruptedException
	{
		String date_1= prop.getProperty("departure_date");
		String split[]=date_1.split(" ");
		String month_year= split[2]+" "+split[3];
		
		String date_2= prop.getProperty("return_date");
		String split2[]=date_1.split(" ");
		String month_year2= split2[2]+" "+split2[3];
	
		homepage= new HomePage(driver);
		homepage.SelectFromCtry(prop.getProperty("from_country"));
		homepage.SelectToCtry(prop.getProperty("to_country"));
		homepage.SelectFromDate(month_year,date_1);
		homepage.SelectToDate(month_year2,date_2);
		homepage.Submit();
	
	}

	}
	


