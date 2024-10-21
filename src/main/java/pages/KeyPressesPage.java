package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By textBar = By.id("target");
    private By keys = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(textBar).sendKeys(text);
    }

    public void enterPi(){
        enterText("\u03C0 = 3.14");
    }

    public String getKeys(){
        return driver.findElement(keys).getText();
    }
}
