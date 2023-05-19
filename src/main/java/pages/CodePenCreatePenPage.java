package pages;

import constants.locators.CodePenCreatePenPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CodePenCreatePenPage extends BasePage {
    private final By htmlTextarea = By.xpath(CodePenCreatePenPageConstants.HTML_TEXTAREA);
    private final By cssTextarea = By.xpath(CodePenCreatePenPageConstants.CSS_TEXTAREA);
    private final By jsTextarea = By.xpath(CodePenCreatePenPageConstants.JS_TEXTAREA);
    private final By titleField = By.id(CodePenCreatePenPageConstants.EDITABLE_TITLE_FIELD);

    public CodePenCreatePenPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return getElementText(titleField);
    }

    public void addHTMLCode(String html){
        enterText(htmlTextarea, html);
    }

    public void addCSSCode(String css){
        enterText(cssTextarea, css);
    }

    public void addJSCode(String js){
        enterText(jsTextarea, js);
    }
}

