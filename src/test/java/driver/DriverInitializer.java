package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitializer {
    public static WebDriver driverInitializer (String browserType) {
        if (browserType.equals("chrome")) {
            return new ChromeDriver();
        } else {
            return new FirefoxDriver();
        }


    }
}
