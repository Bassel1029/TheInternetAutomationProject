package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @Test
    public void TestBackspace(){
        var keyPressesPage = homePage.clickKeypresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getKeys(),"You entered: BACK_SPACE");
    }

    @Test
    public void TestPi(){
        var keyPressesPage = homePage.clickKeypresses();
        keyPressesPage.enterPi();
    }
}
