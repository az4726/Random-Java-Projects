package pageObjects;

//a reflection of the page that youre testing on youre own.
// normally the name of the page object is based on the title/header of the page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSignInPasswordPage {

    private final By signInButton = By.cssSelector("span[id='auth-signin-button-announce']");

    private final By signInPasswordLabel = By.cssSelector("label[for='ap_password']");
    //label[class="a-form-label"]

    WebDriver webdriver;

    public String getPwdLabel(){
        return webdriver.findElement(signInPasswordLabel).getText();
    }

    public String viewSignInButton(){
        return webdriver.findElement(signInButton).getText();
    }

    public AmazonSignInPasswordPage(WebDriver webdriver){
        this.webdriver = webdriver;
    }



}
