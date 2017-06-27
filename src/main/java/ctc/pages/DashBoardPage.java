package ctc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends AbstractPage {
    private static final By LOGGED_LABEL_LOCATOR = By.xpath("//td[@id='headerLogin']/div[@class='blInfoLogin']");

    public DashBoardPage(WebDriver driver) {
        super(driver);
    }

    public String readLoggedinText(){
        String result = getDriver().findElement(LOGGED_LABEL_LOCATOR).getText();
        return result;
    }
}
