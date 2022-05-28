package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	private WebDriver driver;
	
	public MainPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void acessarAreaLogin() {
		driver.findElement(By.xpath("//div[@class='header_user_info']/a[@class='login'][contains(., 'Sign in')]")).click();
	}

}
