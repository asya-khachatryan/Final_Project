import base.BaseTest;
import constants.dataproviders.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CodePenSearchResultPage;

import static constants.messages.PageMessages.emptySearchMessage;
import static constants.urls.PageUrls.searchResultUrl;

public class SearchTests extends BaseTest {

    @org.testng.annotations.DataProvider(name = "valid-search")
    public static Object[][] validSearchTerms(){
        return DataProvider.VALID_SEARCH_TERMS;
    }

    @Test
    public void testNoInputSearch() {
        SoftAssert softAssert = new SoftAssert();
        CodePenSearchResultPage searchResultPage = homePage.search("");
        softAssert.assertEquals(searchResultPage.getPageTitle(), "CodePen Search");
        softAssert.assertTrue(searchResultPage.getCurrentUrl().contains(searchResultUrl));
        softAssert.assertEquals(searchResultPage.getMessage(), emptySearchMessage);
        softAssert.assertAll();
    }



    @Test(dataProvider = "valid-search")
    public void testValidInputSearch(String input) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        CodePenSearchResultPage searchResultPage = homePage.search(input);
        Thread.sleep(1000);
        softAssert.assertEquals(searchResultPage.getPageTitle(), "CodePen Search");
        softAssert.assertTrue(searchResultPage.getCurrentUrl().contains(searchResultUrl));
        String str = input.replaceAll(" ", "+").toLowerCase();
        softAssert.assertEquals(searchResultPage.getCurrentUrl(), searchResultUrl + "?q=" + str);
        softAssert.assertAll();
    }
}
