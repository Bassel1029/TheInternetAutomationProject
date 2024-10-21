package cookie;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNull;

public class CookieTests extends BaseTests {

    @Test
    public void deleteCookieTest(){
        deleteCookie("optimizelyBuckets");
        assertNull(getCookie("optimizelyBuckets"),"Cookie should be deleted, but is still there");
    }
}
