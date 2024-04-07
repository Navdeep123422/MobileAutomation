package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class SamplePage {
    private WebDriver driver;

    // Constructor
    public SamplePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click the create wallet button
    public void clickCreateWalletButton() {
    	
    	WebElement myElement = driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Create a new wallet\"]"));    
    	
    	myElement.click();
    	
    }

    // Method to enter wallet details
    public void enterWalletDetails(String walletName, String password, String confirmPassword) {
        driver.findElement(By.id("walletName")).sendKeys(walletName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("confirmPassword")).sendKeys(confirmPassword);
    }

    // Method to click the create button
    public void clickCreateButton() {
        driver.findElement(By.id("submitButton")).click();
    }

    // Method to check if wallet is created
    public boolean isWalletCreated() {
        return driver.findElement(By.id("walletCreatedMessage")).isDisplayed();
    }

    // Method to check if validation message for mandatory fields is displayed
    public boolean isValidationMessageDisplayed() {
        return driver.findElement(By.id("validationMessage")).isDisplayed();
    }

    // Method to enter password
    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    // Method to check if password strength indicator is displayed
    public boolean isPasswordStrengthIndicatorDisplayed() {
        return driver.findElement(By.id("passwordStrengthIndicator")).isDisplayed();
    }

    // Method to enter password confirmation
    public void enterPasswordConfirmation(String confirmPassword) {
        driver.findElement(By.id("confirmPassword")).sendKeys(confirmPassword);
    }

    // Method to check if password confirmation matches entered password
    public boolean isPasswordConfirmationMatch() {
        String password = driver.findElement(By.id("password")).getAttribute("value");
        String confirmPassword = driver.findElement(By.id("confirmPassword")).getAttribute("value");
        return password.equals(confirmPassword);
    }

    // Method to click the cancel button
    public void clickCancelButton() {
        driver.findElement(By.id("cancelButton")).click();
    }

    // Method to check if the home page is displayed
    public boolean isHomePageDisplayed() {
        return driver.getTitle().equals("Home Page");
    }
}
