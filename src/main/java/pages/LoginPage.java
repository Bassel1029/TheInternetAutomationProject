package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private WebDriver driver;
    private By loginButton = By.className("radius");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLogin(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
