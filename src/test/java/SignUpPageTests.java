import base.BaseTest;
import constants.dataproviders.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CodePenSignUpPage;

import java.util.List;

import static constants.messages.ErrorMessages.nameRequiredErrorMessage;
import static constants.messages.ErrorMessages.duplicateUsernameErrorMessage;
import static constants.messages.ErrorMessages.usernameRequiredErrorMessage;
import static constants.messages.ErrorMessages.emailRequiredErrorMessage;
import static constants.messages.ErrorMessages.passwordCasesErrorMessage;
import static constants.messages.ErrorMessages.passwordNumberErrorMessage;
import static constants.messages.ErrorMessages.passwordSpecialCharacterErrorMessage;
import static constants.messages.ErrorMessages.passwordCharacterCountErrorMessage;


public class SignUpPageTests extends BaseTest {

    @org.testng.annotations.DataProvider
    public static Object[][] invalidUsernames(){
        return DataProvider.INVALID_USERNAMES;
    }


    @Test
    public void testSignUpWithEmptyInputs() {
        SoftAssert softAssert = new SoftAssert();
        CodePenSignUpPage signUpPage = homePage.clickSignUpLink();
        signUpPage.clickSignUpWithEmail();
        signUpPage.clickSubmit();
        List<String> errorMessages = signUpPage.getErrorMessages();
        softAssert.assertTrue(errorMessages.contains(nameRequiredErrorMessage));
        softAssert.assertTrue(errorMessages.contains(duplicateUsernameErrorMessage));
        softAssert.assertTrue(errorMessages.contains(usernameRequiredErrorMessage));
        softAssert.assertTrue(errorMessages.contains(emailRequiredErrorMessage));
        softAssert.assertTrue(errorMessages.contains(passwordCasesErrorMessage));
        softAssert.assertTrue(errorMessages.contains(passwordNumberErrorMessage));
        softAssert.assertTrue(errorMessages.contains(passwordSpecialCharacterErrorMessage));
        softAssert.assertTrue(errorMessages.contains(passwordCharacterCountErrorMessage));
        softAssert.assertAll();
    }

//    @Test
//    public void testLogin() {
//        SoftAssert softAssert = new SoftAssert();
//        CodePenSignUpPage signUpPage = homePage.clickLoginLink();
//        signUpPage.fillUsername("asyaaa");
//        signUpPage.fillPassword("qotxyn-qEkmiv-dobhu8");
//        signUpPage.clickLogin();
//    }

}
