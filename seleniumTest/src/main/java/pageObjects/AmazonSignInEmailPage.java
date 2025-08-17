package pageObjects;

//a reflection of the page that youre testing on youre own.
// normally the name of the page object is based on the title/header of the page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSignInEmailPage {
    private final By signInTitle = By.cssSelector("h1[class='a-spacing-small']");
    //control f that reference in brwowser inspector to make sure its unique. if it's not then find a unique one

    private final By signInEmailLabel = By.cssSelector("label[for='ap_email']");
    //label[class="a-form-label"]

    //couldve used class which is more efficient and faster than css selector but didnt
    // because it looked auto generated and dynamic so it can change in the future.
    // this would mean i'd have to make any changes to my automated tests in the
    // future if there were changes made to the class name so I'm almost future proofing
    // these tests

    private final By signInContinueButton = By.id("continue");
    //input[id="continue"]

    private final By signInEmailBox = By.id("ap_email");

    WebDriver webdriver;

    public String getSignInHeader(){
        return webdriver.findElement(signInTitle).getText();
    }

    public String getSignInEmailLabel(){
        return webdriver.findElement(signInEmailLabel).getText();
    }

    public boolean isContinueSignInButtonDisplayed(){
        //return webdriver.findElement(getSignInContinueButtonLabel).getText().trim();

        //labels are verified as strings, but everything else like buttons, divs,
        // checkboxes, inputs are verified as booleans
        return webdriver.findElement(signInContinueButton).isDisplayed();
    }

    public void clickContinueSignInButton(){
        webdriver.findElement(signInContinueButton).click();
    }

    public void typeEmail(String email){
        webdriver.findElement(signInEmailBox).sendKeys(email);
    }

    public AmazonSignInEmailPage(WebDriver webdriver){
        this.webdriver = webdriver;
    }



}
