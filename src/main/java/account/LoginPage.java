package account;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	private String email;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherCampoEmail() {
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(9999999);
		email = "usuario" + numeroAleatorio + "@gmail.com";
		
		driver.findElement(By.id("email_create")).sendKeys(email);
	}
	
	public void acessarAreaCriacaoConta() {

		driver.findElement(By.id("SubmitCreate")).click();
	}
		
}
