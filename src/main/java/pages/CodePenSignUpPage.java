package pages;

import constants.locators.CodePenSignUpPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CodePenSignUpPage extends BasePage {
    private final By submitButton = By.xpath(CodePenSignUpPageConstants.SUBMIT_BUTTON);
    private final By loginButton = By.xpath(CodePenSignUpPageConstants.LOGIN_BUTTON);
    private final By errorMessage = By.className(CodePenSignUpPageConstants.ERROR_MESSAGE);
    private final By signUpWithEmailButton = By.xpath(CodePenSignUpPageConstants.SIGN_UP_WITH_EMAIL_BUTTON);
    private final By signUpUsernameField = By.id(CodePenSignUpPageConstants.SIGN_UP_USERNAME_FIELD);
    private final By usernamePreview = By.id(CodePenSignUpPageConstants.SIGN_UP_USERNAME_PREVIEW);
    private final By signUpNameField = By.id(CodePenSignUpPageConstants.SIGN_UP_NAME_FIELD);
    private final By signUpEmailField = By.id(CodePenSignUpPageConstants.SIGN_UP_EMAIL_FIELD);
    private final By signUpPasswordField = By.id(CodePenSignUpPageConstants.SIGN_UP_PASSWORD_FIELD);


    private final By usernameField = By.id(CodePenSignUpPageConstants.USERNAME_FIELD);
    private final By passwordField = By.id(CodePenSignUpPageConstants.PASSWORD_FIELD);

    public CodePenSignUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUpWithEmail() {
        clickElement(signUpWithEmailButton);
    }

    public void clickSubmit() {
        clickElement(submitButton);
    }

    public List<String> getErrorMessages() {
        return getElementsTextList(errorMessage);
    }

    public void fillUsername(String username){
        enterText(signUpUsernameField, username);
    }

    public String getUsernamePreview(){
        return getElementText(usernamePreview);
    }

    public void fillName(String name){
        enterText(signUpNameField, name);
    }

    public void fillEmail(String email){
        enterText(signUpEmailField, email);
    }


    public void fillPassword(String password){
        enterText(signUpPasswordField, password);
    }

//    public void fillUsername(String username){
//        enterText(usernameField, username);
//    }
//
//    public void fillPassword(String password){
//        enterText(passwordField, password);
//    }

    public void clickLogin() {
        clickElement(loginButton);
        wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        wait.until(ExpectedConditions.urlContains("https://codepen.io/trending"));
    }



}

