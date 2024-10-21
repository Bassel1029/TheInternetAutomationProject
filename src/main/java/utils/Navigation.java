package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Navigation{

    private WebDriver driver;
    private By ex2Link = By.linkText("Example 2: Element rendered after the fact");

    public Navigation(WebDriver driver) {
        this.driver = driver;
    }


    public void switchToNewTab(String currentWindow) {
        Set<String> windows = driver.getWindowHandles();
        for (String windowHandle : windows) {
            if (!windowHandle.equals(currentWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}