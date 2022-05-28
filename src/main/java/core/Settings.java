package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {
	
	private WebDriver driver;
	
	public Settings( ) { // construtor
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // acha o driver executavel
		driver = new ChromeDriver(); // Adiciona o driver do google ao atributo criado acima
		driver.get("http://automationpractice.com/index.php"); //Acessa a aplicação que queremos testar
		
	}
	
	public WebDriver getDriver() { // pra chamar o driver.get 
		return driver;
	}


}
