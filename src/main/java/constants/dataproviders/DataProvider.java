package constants.dataproviders;

public class DataProvider {

    public static Object[][] INVALID_USERNAMES = new Object[][]{
            {"test"},
            {123}
    };

    public static Object[][] INVALID_EMAILS = new Object[][]{
            {"test.example.com"},
            {12345},
            {"@example.com"},
            {"paul@example"}
    };


    public static Object[][] VALID_SEARCH_TERMS = new Object[][]{
            {"test"},
            {"123"},
            {"search bar"},
            {"Search bar"}
    };


}
