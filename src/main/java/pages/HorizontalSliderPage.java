package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.xpath("//input[@type='range']");
    private By position = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSlider(double value){
        if (value < 0 || value > 5) {
            throw new IllegalArgumentException("Desired position must be between 0 and 5");
        }
        int steps = (int) (value * 2);
        WebElement sliderElement = driver.findElement(slider);
        for(int i = 0; i<steps; i++){
            sliderElement.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderPosition(){
        return driver.findElement(position).getText();
    }
}
