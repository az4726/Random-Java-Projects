package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pageObjects.WorkdaySignInPage;
import io.github.cdimascio.dotenv.Dotenv;

public class WorkdayLoginSteps {

    WebDriver webdriver;
    Dotenv dotenv = Dotenv.configure().ignoreIfMalformed().load();
    WorkdaySignInPage signInPage;

    @Given("I navigate to Workday Login Page")
    public void iNavigateToWorkdayLoginPage() {
        WebDriverManager.chromedriver().setup(); //makes sure you are using chrome
        ChromeOptions options = new ChromeOptions();

        if(dotenv.get("PIPELINE_RUN").equals("true")){
            options.addArguments("--disable-gpu"); // required on some environments
            options.addArguments("--headless=new"); // run without UI
            options.addArguments("--window-size=1920,1080"); // avoid sizing issues
            options.addArguments("--no-sandbox"); // for Linux CI
            options.addArguments("--disable-dev-shm-usage"); // for container environments
        }else{
            options.addArguments("--start-maximized"); //maximised window
            options.addArguments("--no-sandbox"); // for Linux CI
            options.addArguments("--safebrowsing-disable-download-protection");
            options.addArguments("--disable-site-isolation-trials");
            options.addArguments("--disable-extensions");
            options.addArguments("--allow-insecure-localhost");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--deny-permission-prompts");
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        }


        webdriver = new ChromeDriver(options);
        webdriver.get("https://auth.api.workday.com/v1/authorize?client_id=YmUwZTVkZjMtMWRjMy00YzE2LTlmM2UtYjBiYjUxMjU1N2Yx&response_type=code&state=9e0bf357b8975cc19906e8e0b9491841fc7e146ef44232ca906904a63db69e4d&redirect_uri=https%3A%2F%2Fdeveloper.workday.com%2Fwelcome&code_challenge_method=S256&code_challenge=VF5uwqtOgFg3ZWKAyTnPVO7DPPZXcjn_cYGK3c5GziI");
        signInPage = new WorkdaySignInPage(webdriver);
    }

    @When("I see the email textfield")
    public void iSeeTheEmailTextfield() {
        //id="username"
        Assert.assertTrue(signInPage.isEmailTexfieldDisplayed(), "The textfield is not displayed");
        //assertequals last argument is your error message. optonal but realistically you should type one
    }

    @And("I type in {string}")
    public void iTypeIn(String email) {
        //how does error handling work for every other element other than assertions
        signInPage.inputEmail(email);
    }


    @Then("I should see the {string} title")
    public void iShouldSeeTheTitle(String welcomeMessage) {
        Assert.assertEquals(signInPage.readMessage(), welcomeMessage);
    }

    @And("I type in the incorrect password {string}")
    public void iTypeInTheIncorrectPassword(String password) {
        signInPage.inputPassword(password);
    }

    @Then("I see the error message {string}")
    public void iSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(signInPage.isErrorMsgDisplayed(), errorMessage);
    }

    @And("I click the Workday {string} button")
    public void iClickTheWorkdayButton(String buttonLabel) {
        switch (buttonLabel){
            case "Next":
                signInPage.clickNextButton();
                break;
            case "Okay":
                break;
        }
    }
}
