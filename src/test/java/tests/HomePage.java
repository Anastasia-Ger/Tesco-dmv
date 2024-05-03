package tests;

import driver.BrowserType;
import driver.DriverInitializer;
import driver.Settings;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage {
    WebDriver driver;




    @Test
    public void secondTescoTest() throws InterruptedException {
        driver = DriverInitializer.initializeDriver(BrowserType.CHROME);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        driver.get(Settings.BASE_URL);
        Thread.sleep(2000);
        WebElement groceries = driver.findElement(By.xpath("//a[@href='/groceries/en-GB/'][@data-auto='nav-item-link']"));
        groceries.click();
        Thread.sleep(3000);

    }
    @Test
    public void cookieBtnClick() throws InterruptedException {

        driver = DriverInitializer.initializeDriver(BrowserType.CHROME);

        driver.get(Settings.BASE_URL);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        Thread.sleep(3000);
        WebElement ecceptCookieBtn = driver.findElement(By.xpath("//*[@id='sticky-bar-cookie-wrapper']/span/div/div/div[2]/form[1]/button"));
        ecceptCookieBtn.click();
        Thread.sleep(3000);

    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }

}
