package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariffPlan {
	static WebDriver driver;
	
	@Given("The User is in Telecom Page")
	public void the_User_is_in_Telecom_Page() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\GT Sanatorium\\Bala\\Cucumber\\driver\\chromedriver.exe" );
		 driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("The user click on add tariff plan")
	public void the_user_click_on_add_tariff_plan() {
	  
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();	
		
	}

	@When("the user fill all the details{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_all_the_details(String monthlyrental, String freelocal, String freeinternational, String freesms, String localcharge, String internationalcharges, String smscharges) {

		driver.findElement(By.xpath("//input[@name='rental']")).sendKeys(monthlyrental);
		driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys(freelocal);
		driver.findElement(By.xpath("//input[@name='inter_minutes']")).sendKeys(freeinternational);
		driver.findElement(By.xpath("//input[@name='sms_pack']")).sendKeys(freesms);
		driver.findElement(By.xpath("//input[@name='minutes_charges']")).sendKeys(localcharge);
		driver.findElement(By.xpath("//input[@name='inter_charges']")).sendKeys(internationalcharges);
		driver.findElement(By.xpath("//input[@name='sms_charges']")).sendKeys(smscharges);
	}

	@When("click on submit button")
	public void click_on_submit_button() {
	  
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("the user is displayed as congratulation you add tariff plan")
	public void the_user_is_displayed_as_congratulation_you_add_tariff_plan() {
	  Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
		
	}


}
