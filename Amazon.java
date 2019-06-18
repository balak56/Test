package org.sel;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\93ksr\\eclipse-workspace\\Bala\\Selenium\\driver\\chromedriver1.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 List<WebElement> mble = driver.findElements(By.xpath("//div[@id='search']/div/div[2]/div/span[3]//div//a[@class='a-link-normal a-text-normal']/span[contains(text(),'GB')]"));
		 
		 for(WebElement w:mble)
		 {
			 System.out.println(w.getText());
		 }
	}
}
