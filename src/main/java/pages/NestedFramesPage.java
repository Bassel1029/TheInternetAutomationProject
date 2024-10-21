package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTextFromLeft(){
        moveToFrame(topFrame);
        moveToFrame(leftFrame);
        String leftText = driver.findElement(By.tagName("body")).getText();
        moveToMainArea();
        return leftText;
    }

    public String getTextFromBottom(){
        moveToFrame(bottomFrame);
        String bottomText = driver.findElement(By.tagName("body")).getText();
        moveToMainArea();
        return bottomText;
    }

    private void moveToFrame(String frameName){
        driver.switchTo().frame(frameName);
    }

    private void moveToMainArea(){
        driver.switchTo().defaultContent();
    }
}