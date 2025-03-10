package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	private By userField = By.id("user-name");
	private By passField = By.id("password");
	private By messageLabel = By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]");
	private By loginButton = By.id("login-button");	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername(String username) {
		driver.findElement(userField).sendKeys(username);
	}
	
	public void setPassword(String password) {
		driver.findElement(passField).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public String setMessage() {
		WebElement error = driver.findElement(messageLabel);
		return error.getText();
	}
}
