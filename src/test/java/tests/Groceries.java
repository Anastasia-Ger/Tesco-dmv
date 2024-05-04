package tests;

import driver.BrowserType;
import driver.DriverInitializer;
import driver.Settings;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Groceries {
    WebDriver driver;
    @Test
    public void groceriesMenuCheck() throws InterruptedException {
        driver = DriverInitializer.initializeDriver(BrowserType.CHROME);
        driver.get(Settings.BASE_URL);
        Thread.sleep(3000);
        WebElement bbqBtn = driver.findElement(By.xpath("//a[@href = '/groceries/en-GB/shop/bbq?include-children=true']"));
        WebElement groceries = driver.findElement(By.xpath("//a[@href='/groceries/en-GB/'][@data-auto='nav-item-link']"));
        groceries.click();
        Thread.sleep(3000);
        bbqBtn.click();
        Thread.sleep(2000);
        driver.quit();

    }

}
