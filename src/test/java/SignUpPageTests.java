import base.BaseTest;
import constants.dataproviders.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CodePenSignUpPage;

import java.util.List;

import static constants.messages.ErrorMessages.*;


public class SignUpPageTests extends BaseTest {

    @org.testng.annotations.DataProvider
    public static Object[][] invalidUsernames(){
        return DataProvider.INVALID_USERNAMES;
    }

    @org.testng.annotations.DataProvider(name = "invalid-emails")
    public static Object[][] invalidEmails(){
        return DataProvider.INVALID_EMAILS;
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

    @Test
    public void testValidInputs(){
        SoftAssert softAssert = new SoftAssert();
        CodePenSignUpPage signUpPage = homePage.clickSignUpLink();
        signUpPage.clickSignUpWithEmail();
        signUpPage.fillName("Asya");
        signUpPage.fillUsername("asyatesting");
        signUpPage.fillEmail("asya_khachatryan2@edu.aua.am");
        signUpPage.fillPassword("#Test2023");
        List<String> errorMessages = signUpPage.getErrorMessages();
        softAssert.assertTrue(errorMessages.isEmpty());
    }

    @Test
    public void testTakenUsername(){
        SoftAssert softAssert = new SoftAssert();
        CodePenSignUpPage signUpPage = homePage.clickSignUpLink();
        signUpPage.clickSignUpWithEmail();
        signUpPage.fillUsername("test");
        List<String> errorMessages = signUpPage.getErrorMessages();
        softAssert.assertTrue(errorMessages.contains(duplicateUsernameErrorMessage));
    }

    @Test(dataProvider = "invalid-emails")
    public void testSignUpWithInvalidEmails(String email){
        SoftAssert softAssert = new SoftAssert();
        CodePenSignUpPage signUpPage = homePage.clickSignUpLink();
        signUpPage.clickSignUpWithEmail();
        signUpPage.fillEmail(email);
        signUpPage.clickSubmit();
        List<String> errorMessages = signUpPage.getErrorMessages();
        softAssert.assertTrue(errorMessages.contains(emailInvalidErrorMessage));
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
