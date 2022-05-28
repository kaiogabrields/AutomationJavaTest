package execution;




import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import account.CreateAccountPage;
import account.LoginPage;
import core.Settings;
import main.MainPage;
import utils.Utils;

public class ExecutionTest {

	private WebDriver driver;
	private Settings settings;
	private MainPage mainPage;
	private LoginPage loginPage;
	private CreateAccountPage createAcPage;
	private Utils utils;
	
	@Before
	public void before() {
		settings = new Settings();
		mainPage = new MainPage(settings.getDriver());
		loginPage = new LoginPage(settings.getDriver());
		createAcPage = new CreateAccountPage(settings.getDriver());
		driver = settings.getDriver();
		utils = new Utils();
	
	}
	
	@After
	public void after() {
		driver.quit();
	}		
	
	@Test
	public void realizarCadastro() {
		
		mainPage.acessarAreaLogin();
		
		loginPage.preencherCampoEmail();
		loginPage.acessarAreaCriacaoConta();
		
		utils.esperar(5000);
		
		createAcPage.preencherRadioBoxTitle("id_gender1");
		createAcPage.preencherCampoFirstName("Rogerio");
		createAcPage.preencherCampoLastName("Souza");
		createAcPage.preencherCampoPassword("teste2003");
		createAcPage.selecionarComboBoxData("23","10","2003");
		createAcPage.preencherCampoCompany("Darbon");
		createAcPage.preencherCampoAddress("vila bocaina");
		createAcPage.preencherCampoCity("São Caetano");
		createAcPage.selecionarComboBoxState(1);
		createAcPage.preencherCampoPostalCode("00000");
		createAcPage.selecionarComboBoxCountry(1);
		createAcPage.preencherCampoMobilePhone("11924243388");
		createAcPage.preencherCampoAddressAlternative("São Paulo");
		createAcPage.clicarBotaoRegister();
		
		utils.esperar(5000);
		
		createAcPage.validarCadastrado();
		
	}
	
	
}
