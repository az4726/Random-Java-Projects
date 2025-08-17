package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.AmazonHomePage;
import pageObjects.AmazonSignInEmailPage;
import pageObjects.AmazonSignInPasswordPage;

public class AmazonLoginSteps {

    WebDriver webdriver;
    AmazonHomePage homepage;
    AmazonSignInEmailPage signInPageEmail;
    AmazonSignInPasswordPage signInPagePassword;

    @Given("I navigate to Amazon")
    public void iNavigateToAmazon(){
        WebDriverManager.chromedriver().setup();
        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get("https://www.amazon.co.uk");
        homepage = new AmazonHomePage(webdriver);
        signInPageEmail =  new AmazonSignInEmailPage(webdriver);
        signInPagePassword = new AmazonSignInPasswordPage(webdriver);
    }

    @When("I press the login button")
    public void iPressTheLoginButton() {
        homepage.clickHelloSignInButton();
    }

    @Then("I should see the login page title {string}")
    public void iShouldSeeTheLoginPageTitle(String expectedTitle) {
        Assert.assertEquals(signInPageEmail.getSignInHeader(), expectedTitle);
    }

    @Then("I should see the email textfield {string}")
    public void iShouldSeeTheEmailTextfield(String emailLabel) {
        Assert.assertEquals(signInPageEmail.getSignInEmailLabel(), emailLabel);
    }

    @Then("I should see the button to {string} to password page")
    public void iShouldSeeTheButtonToContinueToPasswordPage(String buttonLabel) {
        Assert.assertTrue(signInPageEmail.isContinueSignInButtonDisplayed());

    }

    @When("I click the {string} button")
    public void iClickTheContinueButton(String buttonLabel) {
        //signInPageEmail.clickContinueSignInButton();
        switch (buttonLabel){
            case "Continue":
                Assert.assertTrue(signInPageEmail.isContinueSignInButtonDisplayed());
                signInPageEmail.clickContinueSignInButton();
                break;
            case "OK":
                break;
        }
    }

    @Then("I should see the {string} textfield")
    public void iShouldSeeThePasswordTextfield(String passwordLabel) {
        Assert.assertEquals(signInPagePassword.getPwdLabel(), passwordLabel);
    }

    @Then("I should see the {string} button to login")
    public void iShouldSeeTheButtonToLogin(String passwordBtnLabel) {
        Assert.assertEquals(signInPagePassword.viewSignInButton(), passwordBtnLabel);
    }

    @Then("I type the email {string}")
    public void iTypeTheEmail(String email) {
        signInPageEmail.typeEmail(email);
    }
}
