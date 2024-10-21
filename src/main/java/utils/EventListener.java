package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class EventListener implements WebDriverListener {

    @Override
    public void beforeClick(WebElement element) {
        System.out.println("Before clicking on: " + element);
    }

    @Override
    public void afterClick(WebElement element) {
        System.out.println("After clicking on: " + element);
    }

}
