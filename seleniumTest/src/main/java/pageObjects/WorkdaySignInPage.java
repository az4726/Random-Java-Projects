package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WorkdaySignInPage {

    //page objects can be reused. its okay to have the methods here even if youre not gonna use them
    //all the actions are on thje page objects. because these are a reflection of the page

    WebDriver webDriver;

    //in some cases workday is slow because thres so much data to load, and
    // webdriver doesnt always wait and can time out because of the long l
    // oading times.
    //Selenium has webdriver.wait
    WebDriverWait webDriverWait;

    private final By emailInput = By.id("username");
    private final By loginBtn = By.cssSelector("Button[class='wdc-btn wdc-btn-primary']");
    private final By welcomeMsg = By.cssSelector(".welcome");
    private final By passwordInput = By.id("password_field_1");
    private final By errorMessage = By.className("field-error");

    public WorkdaySignInPage(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public boolean isEmailTexfieldDisplayed(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        return webDriver.findElement(emailInput).isDisplayed();
    }

    public void inputEmail(String email){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        webDriver.findElement(emailInput).sendKeys(email);
    }

    public void clickNextButton(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        //the correct expecrted condition would not be visiblity of element located. it would
        // be elementToBeClickable
        webDriver.findElement(loginBtn).click();
    }

    public String readMessage() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeMsg));
        return message.getText().trim();
    }

    public void inputPassword(String password){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        webDriver.findElement(passwordInput).sendKeys(password);
    }

    public String isErrorMsgDisplayed(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return webDriver.findElement(errorMessage).getText().trim();
    }

}
