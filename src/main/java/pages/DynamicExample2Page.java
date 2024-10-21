package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicExample2Page {

    private WebDriver driver;
    private By startButton = By.xpath("//button[text()='Start']");
    private By helloWorldText = By.id("finish");

    public DynamicExample2Page(WebDriver driver){
        this.driver = driver;
    }

    public String getHiddenText(){
        clickStartButton();
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(helloWorldText));
        return driver.findElement(helloWorldText).getText();
    }

    public boolean checkButton(){
        return driver.findElement(startButton).isDisplayed();
    }

    private void clickStartButton(){
        driver.findElement(startButton).click();
    }

}
