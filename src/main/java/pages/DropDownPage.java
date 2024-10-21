package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropdown(String option){
        findDropdown().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
    List<WebElement> selectedElements = findDropdown().getAllSelectedOptions();
    return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public void changeNumOfOptions(){
        WebElement dropdown1 = driver.findElement(dropdown);
        String script = "arguments[0].setAttribute('multiple','')";
        var jsExecutor = (JavascriptExecutor)driver;
        jsExecutor.executeScript(script,dropdown1);
    }

    private Select findDropdown(){
        return new Select(driver.findElement(dropdown));
    }
}
