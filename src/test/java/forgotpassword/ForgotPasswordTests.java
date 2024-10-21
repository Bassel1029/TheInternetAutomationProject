package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void successfulForgotPassword() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        EmailSentPage emailSentPage = forgotPasswordPage.RetrievePassword("ahmed@gmail.com");
        assertEquals(emailSentPage.getMsg(),"your e-mail's been sent!","Message is incorrect!");
    }

}
