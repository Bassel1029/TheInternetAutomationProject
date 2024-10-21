package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By alertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By confirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By promptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By alertMsg = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAlertButton(){
        driver.findElement(alertButton).click();
    }

    public void clickConfirmButton(){
        driver.findElement(confirmButton).click();
    }

    public void clickPromptButton(){
        driver.findElement(promptButton).click();
    }

    public String getAlertMsg(){
       return driver.findElement(alertMsg).getText();
    }

    public String getMsgForConfirmButton(){
        return driver.switchTo().alert().getText();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void sendPrompt(String message){
    driver.switchTo().alert().sendKeys(message);
    }
}
