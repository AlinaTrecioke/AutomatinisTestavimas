package lt.techin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;

public class ClickAllTest extends BaseTest {

    @Test
    void testClickAll() {
        ClickAllPage clickAllPage = new ClickAllPage(driver);


        while (clickAllPage.getSquare().equals("true")) {
            clickAllPage.clickAtAllSquares();
            clickAllPage.acceptAlert();
        }
    }
}
