package tests;

import driver.DriverInitializer;
import driver.Settings;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise02 {
    WebDriver driver;

    @Test
    public void firstTescoTest() throws InterruptedException {
        driver = DriverInitializer.driverInitializer("chrome");
        driver.get(Settings.URL);
        Thread.sleep(5000);
        driver.quit();

    }

}
