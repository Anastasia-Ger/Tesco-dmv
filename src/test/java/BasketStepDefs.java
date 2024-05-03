import driver.BrowserType;
import driver.DriverInitializer;
import driver.Settings;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class BasketStepDefs {
    WebDriver driver;
    @Given("I am on the home page")
    public void iAmOnTheHomePage() throws InterruptedException {
        driver = DriverInitializer.initializeDriver(BrowserType.CHROME);
        driver.get(Settings.BASE_URL);
        Thread.sleep(2000);
        driver.quit();
    }

    @When("I check the Basket title")
    public void iCheckTheBasketTitle() {
    }

    @Then("I see the Basket title")
    public void iSeeTheBasketTitle() {
    }
}
