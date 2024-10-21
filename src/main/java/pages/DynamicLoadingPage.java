package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Navigation;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By ex2Link = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicExample2Page clickEx2(){
        clickLink("Example 2: Element rendered after the fact");
        return new DynamicExample2Page(driver);
    }

    public DynamicExample2Page rightClickToDynamicExample2() {
        Actions actions = new Actions(driver);
        WebElement example2Link = driver.findElement(ex2Link);
        actions.keyDown(Keys.CONTROL).click(example2Link).keyUp(Keys.CONTROL).perform();
        Navigation navigation = new Navigation(driver);
        navigation.switchToNewTab(driver.getWindowHandle());
        return new DynamicExample2Page(driver);
    }

        private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
