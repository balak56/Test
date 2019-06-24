package com.stepdefinition;


import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomer {
	
	static WebDriver driver;
	@Given("The User is in telecom home page")
	public void the_User_is_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GT Sanatorium\\Bala\\Cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() {
		driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();
	}

	@When("The user is filling all the details")
	public void the_user_is_filling_all_the_details(DataTable customerdetails) {
		List<String> customerdetailsList = customerdetails.asList(String.class);
			driver.findElement(By.xpath("//label[@for='done']")).click();
		 driver.findElement(By.id("fname")).sendKeys(customerdetailsList.get(0));
		   driver.findElement(By.id("lname")).sendKeys(customerdetailsList.get(1));
		   driver.findElement(By.id("email")).sendKeys(customerdetailsList.get(2));
		   driver.findElement(By.name("addr")).sendKeys(customerdetailsList.get(3));
		   driver.findElement(By.name("telephoneno")).sendKeys(customerdetailsList.get(4));
		
	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@Then("The user should see the customer id")
	public void the_user_should_see_the_customer_id() {
	
		 Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());

		
	}


}
