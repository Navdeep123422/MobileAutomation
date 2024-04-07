package tests;
import org.testng.annotations.Test;
import pages.SamplePage;
import static org.testng.Assert.assertTrue;
public class SampleTest extends BaseTest {

    @Test
    public void testCreateWallet() {
        SamplePage samplePage = new SamplePage(driver);
        samplePage.clickCreateWalletButton();
        samplePage.enterWalletDetails("Test Wallet", "TestPassword123", "TestPassword123");
        samplePage.clickCreateButton();
        
        // Verify successful creation of a new wallet
        assertTrue(samplePage.isWalletCreated(), "Wallet creation succesfull");
    }

    @Test
    public void testValidationForMandatoryFields() {
        SamplePage samplePage = new SamplePage(driver);
        samplePage.clickCreateWalletButton();
        samplePage.clickCreateButton();
        
        // Verify validation for mandatory fields
        assertTrue(samplePage.isValidationMessageDisplayed(), "Validation message for mandatory fields not displayed");
    }

    @Test
    public void testPasswordStrengthIndicator() {
    	
        //Check if password strength indicator is displayed and functional
        SamplePage samplePage = new SamplePage(driver);
        samplePage.enterPassword("TestPassword123");
        
        // Verify if the progress bar is displayed
        assertTrue(samplePage.isPasswordStrengthIndicatorDisplayed(), "Password strength indicator not displayed");
    }

    @Test
    public void testPasswordConfirmation() {
    	
        //Check if password confirmation field matches entered password
        SamplePage samplePage = new SamplePage(driver);
        samplePage.enterPassword("TestPassword123");
        samplePage.enterPasswordConfirmation("TestPassword123");
        
        // Verify if the green checkmark is displayed
        assertTrue(samplePage.isPasswordConfirmationMatch(), "Password confirmation does not match");
    }

    @Test
    public void testCancelFunctionality() {
    	
        //Click cancel button and verify if the operation is canceled
        SamplePage samplePage = new SamplePage(driver);
        samplePage.clickCancelButton();
        
        // Verify if the home page is displayed after canceling
        assertTrue(samplePage.isHomePageDisplayed(), "Cancel functionality failed");
    }
}
