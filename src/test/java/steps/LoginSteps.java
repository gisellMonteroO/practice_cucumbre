package steps;

import pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
	
	private WebDriver driver;
	private LoginPage loginPage;
	
	
	@Given("El usuario abre la pagina de login")
	public void openLoginPage() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		loginPage = new LoginPage(driver);
	}
	@When("El usuario ingresa su nombre y contraseña")
	public void enterCredentials() {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.setUsername("standard_user");
		loginPage.setPassword("secret_sauce");
		loginPage.clickLoginButton();
	}
	@Then("El usuario es redirigido al dashboards")
	public void verifyDashboardRedirection() {
	    // Write code here that turns the phrase above into concrete actions
	    String currentUrl = driver.getCurrentUrl();
	    assertTrue(currentUrl.contains("inventory"));
	    driver.quit();
	}
	@When("El usuario ingresa un nombre y contraseña inválidos")
	public void el_usuario_ingresa_un_nombre_y_contraseña_inválidos() {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.setUsername("pruebainc");
	    loginPage.setPassword("pruebaincdos");
	    loginPage.clickLoginButton();
	}
	@Then("El sistema muestra mensaje de alerta")
	public void el_sistema_muestra_mensaje_de_alerta() {
	    // Write code here that turns the phrase above into concrete actions
	    String errorInvalid = loginPage.setMessage();
	    assertEquals("Epic sadface: Username and password do not match any user in this service", errorInvalid);
	    driver.quit();
	}
}
