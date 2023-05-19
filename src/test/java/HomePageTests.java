import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CodePenSignUpPage;

import static constants.urls.PageUrls.signUpUrl;


public class HomePageTests extends BaseTest {

    @Test
    public void testNavigateToSignUpPage() {
        SoftAssert softAssert = new SoftAssert();
        CodePenSignUpPage signUpPage = homePage.clickSignUpLink();
        softAssert.assertEquals(signUpPage.getPageTitle(), "CodePen Free Sign Up");
        softAssert.assertEquals(signUpPage.getCurrentUrl(), signUpUrl);
        softAssert.assertAll();
    }
}
