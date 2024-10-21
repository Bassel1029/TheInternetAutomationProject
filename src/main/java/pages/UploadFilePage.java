package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {
    private WebDriver driver;
    private By chooseFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFileName = By.id("uploaded-files");

    public UploadFilePage(WebDriver driver){
        this.driver = driver;
    }

    public void uploadFile(String pathToFile){
        driver.findElement(chooseFile).sendKeys(pathToFile);
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFileName(){
        return driver.findElement(uploadedFileName).getText();
    }



}
