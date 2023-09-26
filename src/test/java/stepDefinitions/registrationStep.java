package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registrationStep {
    public static WebDriver driver;
    //  public void thatINavigateToSpareroomWebsite()



    // @Given("that i navigate to spareroom website")
    @Given("that i navigate to spareroom website")
    public void thatINavigateToSpareroomWebsite()




    {
        driver = new ChromeDriver();
        driver.get("https://www.spareroom.co.uk/");
    }

    @When("i click on register button")
    public void iClickOnRegisterButton() {
    }

    @Then("i am on the page")
    public void iAmOnThePage() {
    }
}
