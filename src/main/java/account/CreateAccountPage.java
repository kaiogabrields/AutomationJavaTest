package account;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	
	
	private WebDriver driver;
		
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}
		
	public void clicarBotaoCreate() {
		driver.findElement(By.id("SubmitCreate")).click();
	}
	
	public void preencherRadioBoxTitle(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public void preencherCampoFirstName(String firstName) {
		driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
	}
	
	public void preencherCampoLastName(String lastName) {
		driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
	}
	
	public void preencherCampoPassword(String password) {
		driver.findElement(By.id("passwd")).sendKeys(password);
		
	}
	
	public void selecionarComboBoxData(String dia, String mes, String ano){ 
		WebElement days = driver.findElement(By.id("days"));
		WebElement months = driver.findElement(By.id("months"));
		WebElement years = driver.findElement(By.id("years"));
		
		Select combo = new Select(days);
		Select combo2 = new Select(months);
		Select combo3 = new Select(years);
		
		combo.selectByValue(dia);
		combo2.selectByValue(mes);
		combo3.selectByValue(ano);

	}
	
	public void preencherCampoCompany(String company){
		driver.findElement(By.id("company")).sendKeys(company);
	}
	
	public void preencherCampoAddress(String address){
		driver.findElement(By.id("address1")).sendKeys(address);
	}
	
	public void preencherCampoCity(String city){
		driver.findElement(By.id("city")).sendKeys(city);
	}
	
	public void selecionarComboBoxState(int optionIndexState){
		WebElement state = driver.findElement(By.id("id_state"));
		
		Select combo = new Select(state);
		combo.selectByIndex(optionIndexState);
	}
	
	public void preencherCampoPostalCode(String cep){
		driver.findElement(By.id("postcode")).sendKeys(cep);
	}
	
	public void selecionarComboBoxCountry(int optionIndexCountry){
		WebElement country = driver.findElement(By.id("id_country"));
		Select combo = new Select(country);
		combo.selectByIndex(optionIndexCountry);
	}
	
	public void preencherCampoMobilePhone(String celular){
		driver.findElement(By.id("phone_mobile")).sendKeys(celular);
	}

	public void preencherCampoAddressAlternative(String AddressAlternative) {
		WebElement campoAddressAlternative = driver.findElement(By.id("alias"));
		campoAddressAlternative.clear();
		campoAddressAlternative.sendKeys(AddressAlternative);
	}
	
	public void clicarBotaoRegister() {
		driver.findElement(By.id("submitAccount")).click();
	}
	
	public void validarCadastrado() {
		WebElement personalInformation = driver.findElement(By.xpath("//span[contains(., 'My personal information')]"));
		
		if(personalInformation.isDisplayed()){
			System.out.println("Cadastrado");
		}
		else {
			System.out.println("Não cadastrado.");
		}
		
		
	}
	
	
	
		

}
