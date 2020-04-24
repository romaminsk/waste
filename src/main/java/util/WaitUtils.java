package util;

import driver.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class WaitUtils {

        public static void waitForElementVisible(final WebElement element) {
        waitForElementVisible(element , 20);
    }

    public static void waitForElementVisible(final WebElement element, int waitingTime) {
        CustomLogger.info("Waiting visibility of an element");
        new WebDriverWait(WebDriverManager.getDriver(), waitingTime)
                .until(ExpectedConditions.visibilityOf(element));
    }
}
