package pages;

import constants.locators.CodePenSearchResultPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CodePenSearchResultPage extends BasePage {
    private final By messageBox = By.cssSelector(CodePenSearchResultPageConstants.MESSAGE_BOX);

    public CodePenSearchResultPage(WebDriver driver) {
        super(driver);
    }

    public String getMessage(){
        return getElementText(messageBox);
    }
}

