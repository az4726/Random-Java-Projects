package pageObjects;

//a reflection of the page that youre testing on youre own.
// normally the name of the page object is based on the title/header of the page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.http.WebSocket;

public class AmazonHomePage {
    private final By helloSignInButton = By.cssSelector("a[data-csa-c-slot-id='nav-link-accountList']");
    //control f that reference in brwowser inspector to make sure its unique. if it's not then find a unique one


    WebDriver webdriver;

    public void clickHelloSignInButton(){
        webdriver.findElement(helloSignInButton).click();
    }

    public AmazonHomePage(WebDriver webdriver){
        this.webdriver = webdriver;
    }



}
