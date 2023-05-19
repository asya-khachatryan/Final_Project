package pages;

import constants.locators.CodePenHomePageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CodePenHomePage extends BasePage {
    private final By searchBox = By.xpath(CodePenHomePageConstants.SEARCH_BOX);
    private final By signUpButton = By.xpath(CodePenHomePageConstants.SIGN_UP_BUTTON);
    private final By loginButton = By.xpath(CodePenHomePageConstants.LOGIN_BUTTON);
    private final By startCodingButton = By.xpath(CodePenHomePageConstants.START_CODING_BUTTON);

    public CodePenHomePage(WebDriver driver) {
        super(driver);
    }

    public CodePenSearchResultPage search(String query) {
        enterText(searchBox, query);
        clickEnter(searchBox);
        return new CodePenSearchResultPage(driver);
    }

    public CodePenSignUpPage clickSignUpLink() {
        clickElement(signUpButton);
        return new CodePenSignUpPage(driver);
    }

    public CodePenSignUpPage clickLoginLink() {
        clickElement(loginButton);
        return new CodePenSignUpPage(driver);
    }

    public CodePenCreatePenPage clickStartCodingButton() {
        clickElement(startCodingButton);
        return new CodePenCreatePenPage(driver);
    }
}
