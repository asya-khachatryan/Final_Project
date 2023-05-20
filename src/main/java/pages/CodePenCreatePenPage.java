package pages;

import constants.locators.CodePenCreatePenPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class CodePenCreatePenPage extends BasePage {
    private final By htmlTextarea = By.xpath(CodePenCreatePenPageConstants.HTML_TEXTAREA);
    private final By cssTextarea = By.xpath(CodePenCreatePenPageConstants.CSS_TEXTAREA);
    private final By jsTextarea = By.xpath(CodePenCreatePenPageConstants.JS_TEXTAREA);
    private final By titleField = By.id(CodePenCreatePenPageConstants.EDITABLE_TITLE_FIELD);

    private final By htmlSettings = By.xpath(CodePenCreatePenPageConstants.HTML_SETTING_DROPDOWN);
    private final By analyzeHtml = By.id(CodePenCreatePenPageConstants.ANALYZE_HTML_BUTTON);
    private final By htmlErrorMessageBox = RelativeLocator.with(By.xpath(CodePenCreatePenPageConstants.MESSAGE_BOX)).near(htmlTextarea);


    private final By cssSettings = By.xpath(CodePenCreatePenPageConstants.CSS_SETTING_DROPDOWN);
    private final By analyzeCSS = By.id(CodePenCreatePenPageConstants.ANALYZE_CSS_BUTTON);
    private final By cssErrorMessageBox = RelativeLocator.with(By.xpath(CodePenCreatePenPageConstants.MESSAGE_BOX)).near(cssTextarea);

    private final By jsSettings = By.xpath(CodePenCreatePenPageConstants.JS_SETTING_DROPDOWN);
    private final By analyzeJs = By.id(CodePenCreatePenPageConstants.ANALYZE_JS_BUTTON);
    private final By jsErrorMessageBox = RelativeLocator.with(By.xpath(CodePenCreatePenPageConstants.MESSAGE_BOX)).near(jsTextarea);

    private final By penSettingButton = By.xpath(CodePenCreatePenPageConstants.PEN_SETTING_BUTTON);
    private final By closePenSettingButton = By.xpath(CodePenCreatePenPageConstants.CLOSE_PEN_SETTING_BUTTON);

    private final By penTitleField = By.id(CodePenCreatePenPageConstants.PEN_TITLE_INPUT_FIELD);
    private final By penTitleFieldValue = RelativeLocator.with(By.xpath(CodePenCreatePenPageConstants.INPUT_TEXT)).near(penTitleField);

    private final By penDescriptionField = By.id(CodePenCreatePenPageConstants.PEN_DESCRIPTION_INPUT_FIELD);
    private final By penDescriptionFieldValue = RelativeLocator.with(By.xpath(CodePenCreatePenPageConstants.INPUT_TEXT)).near(penDescriptionField);

    private final By penTagsField = By.id(CodePenCreatePenPageConstants.PEN_TAG_INPUT_FIELD);
    private final By penTagsFieldValue = RelativeLocator.with(By.xpath(CodePenCreatePenPageConstants.INPUT_TEXT)).near(penTagsField);



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

    public void clickHtmlSettingDropdown(){
        clickElement(htmlSettings);
    }

    public void clickAnalyzeHtml(){
        clickElement(analyzeHtml);
    }

    public String getHtmlErrorMessage(){
        return getElementText(htmlErrorMessageBox);
    }

    public boolean isHtmlErrorDisplayed(){
        return isElementDisplayed(htmlErrorMessageBox);
    }

    public void clickCssSettingDropdown(){
        clickElement(cssSettings);
    }

    public void clickAnalyzeCss(){
        clickElement(analyzeCSS);
    }

    public String getCssErrorMessage(){
        return getElementText(cssErrorMessageBox);
    }

    public boolean isCssErrorDisplayed(){
        return isElementDisplayed(cssErrorMessageBox);
    }

    public void clickJsSettingDropdown(){
        clickElement(jsSettings);
    }

    public void clickAnalyzeJs(){
        clickElement(analyzeJs);
    }

    public String getJsErrorMessage(){
        return getElementText(jsErrorMessageBox);
    }

    public boolean isJsErrorDisplayed(){
        return isElementDisplayed(jsErrorMessageBox);
    }

    public void clickPenSettings(){
        clickElement(penSettingButton);
    }

    public void clickClosePenSettings(){
        clickElement(closePenSettingButton);
    }

    public void fillPenTitleField(String title){
        enterText(penTitleField, title);
    }

    public String getPenTitleFieldValue(){
        return getElementText(penTitleFieldValue);
    }

    public void fillPenDescriptionField(String description){
        enterText(penDescriptionField, description);
    }

    public String getPenDescriptionFieldValue(){
        return getElementText(penDescriptionFieldValue);
    }

    public void fillPenTagsField(String tags){
        enterText(penTagsField, tags);
    }

    public String getPenTagsFieldValue(){
        return getElementText(penTagsFieldValue);
    }
}

