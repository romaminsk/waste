package step;

import driver.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pageobject.InvoicesPage;

public abstract class BaseStep {

//    protected InvoicesPage invoicesPage;
//
//    public BaseStep(WebDriver driver){
//        this.invoicesPage = new InvoicesPage(driver);
//    }
public static WebDriver driver;

    protected BaseStep()
    {
        driver = WebDriverManager.getDriver();
    }
}
