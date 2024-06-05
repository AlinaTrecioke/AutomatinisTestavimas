package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ClickAllPage extends BasePage {


    @FindBy(className = "icon")
    private List<WebElement> squares;


    @FindBy(className = "icon")
    private WebElement square;

    public ClickAllPage(WebDriver driver) {
        super(driver);
    }

    public void clickAtAllSquares() {
        for (WebElement square : squares) {
            square.click();
        }
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getSquare() {

        String active = square.getAttribute("active");
        active = "true";

        return active;
    }

}