package navigation;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Navigation;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    public void testingNavigation(){
        var example2 = homePage.clickDynamicLoading().rightClickToDynamicExample2();
        assertTrue(example2.checkButton(),"Button missing!");
    }
}
