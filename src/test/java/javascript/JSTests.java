package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class JSTests extends BaseTests {

    @Test
    public void JavaScriptTest(){
        var dropdown = homePage.clickDropDown();
        dropdown.changeNumOfOptions();
        dropdown.selectFromDropdown("Option 1");
        dropdown.selectFromDropdown("Option 2");
        List<String> selectedOptions = dropdown.getSelectedOptions();
        assertEquals(selectedOptions.size(),2,"Incorrect number of options!");
        assertTrue(selectedOptions.contains("Option 1"),"Option 1 missing!");
        assertTrue(selectedOptions.contains("Option 2"),"Option 2 missing!");
    }
}
