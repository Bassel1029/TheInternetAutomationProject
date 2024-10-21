package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void WaitVisibilityTest(){
        var dynamicEx2 = homePage.clickDynamicLoading().clickEx2();
        assertEquals(dynamicEx2.getHiddenText(),"Hello World!","Incorrect text!");
    }
}
