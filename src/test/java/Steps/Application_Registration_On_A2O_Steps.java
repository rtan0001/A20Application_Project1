

package Steps;

        import Base.BaseUtil;

        import Pages.Application_Registration_On_A2O_Page;
        import cucumber.api.PendingException;
        import cucumber.api.java.en.And;
        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import org.junit.Assert;
        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;

        import java.util.ArrayList;

        import static Pages.Application_Registration_On_A2O_Page.getWindow;
        import static Pages.Application_Registration_On_A2O_Page.getWindow_First;

public class Application_Registration_On_A2O_Steps extends BaseUtil {

//    public static WebDriver driver;




    Application_Registration_On_A2O_Page reg_email = new Application_Registration_On_A2O_Page(driver);
    public String email;
    public String title;
    public String Full_Title;
    public String GiveName;
    public String FullName;
    public String Email;


    @Then("^I close the browser$")
    public void iCloseTheBrowser() throws Throwable {
        driver.close();
    }




    @And("^I set an email into inbox$")
    public void iSetAnEmailIntoInbox() throws Throwable {

        reg_email.Set_Created_Email_into_Inbox(Full_Title);


    }

    @And("^I click on welcome message$")
    public void iClickOnWelcomeMessage() throws Throwable {
        reg_email.Click_Welcome_Email();
    }

    @Then("^I click on Complete Registration button from Email$")
    public void iClickOnCompleteRegistrationButtonFromEmail() throws Throwable {
        reg_email.Click_Complete_Registration();
    }

    @Then("^T Set password and Change Password$")
    public void tSetPasswordAndChangePassword() throws Throwable {
        reg_email.Set_password();
        reg_email.Set_ConfirmPassword();
        reg_email.Click_Change_Password();

    }

//    @Then("^Logout ([^\"]*) of the Application$")
//    public void logoutLogoutOfTheApplication(String logout) throws Throwable {
//
//        reg_email.Click_Logout();
//        Thread.sleep(4000);
//    }


    @And("^Close the browser$")
    public void closeTheBrowser() {
        driver.close();
    }

    @Then("^I Logout from the Application$")
    public void iLogoutFromTheApplication() throws Throwable {
        reg_email.Click_Logout();
        Thread.sleep(4000);
    }







    @Given("^I navigate to the mailinator public website$")
    public void iNavigateToTheMailinatorPublicWebsite() throws Throwable {
//      /        System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
//        driver = new ChromeDriver();
        initialization();
        driver.get("https://www.mailinator.com/");
        Thread .sleep(2000);
        driver.manage().window().maximize();
    }

    @And("^I Set a new email and Click Go$")
    public void iSetANewEmailAndClickGo() throws Throwable {

//        GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);
//        email = reg_email.Set_Email_In_Mailitanor();
        email = reg_email.Generate_random_mailinatorEmail();
        System.out.println(email);

        Thread .sleep(2000);
//        GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);
        reg_email.Click_GoButton();


    }

    @Then("^I should login into mailinator inbox$")
    public void iShouldLoginIntoMailinatorInbox() throws Throwable {

        Thread.sleep(5000);
        title = reg_email.Get_Title();
        Assert.assertEquals(email.toLowerCase(),title);
        Full_Title = reg_email.Get_Full_Title();
    }

    @Given("^I navigate to the my.app Application Registration page and Click Register link$")
    public void iNavigateToTheMyAppApplicationRegistrationPageAndClickRegisterLink() throws Throwable {
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, "T");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        driver.findElement(By.tagName("body")).sendKeys(selectLinkOpeninNewTab);
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://sit-monashpartner.cs31.force.com/admissions/s/login/");
//        driver.get("https://staging-monashpartner.cs6.force.com/admissions/s/login/");
        Thread .sleep(3000);
//        driver.manage().window().maximize();

        reg_email.Registration_Link_Click();
    }

    @Then("^I Set GivenName FamilyName and Email and Click Singup$")
    public void iSetGivenNameFamilyNameAndEmailAndClickSingup() throws Throwable {

        reg_email.set_GivenName_FamilyName_Email(GiveName,  FullName, Email);
        reg_email.Click_On_SignUp_Button();
        Thread .sleep(2000);

    }

    @Given("^I navigate back to mailinator inbox to refresh and see Reg Email is in inbox$")
    public void iNavigateBackToMailinatorInboxToRefreshAndSeeRegEmailIsInInbox() throws Throwable {

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        //Refresh the page
        driver.navigate().refresh();
    }

    @And("^I click welcome email link$")
    public void iClickWelcomeEmailLink() throws Throwable {

        reg_email.Click_Welcome_Email();
    }


    @Then("^I click Complete Registration button from Email and reset password$")
    public void iClickCompleteRegistrationButtonFromEmailAndResetPassword() throws Throwable {

        reg_email.Click_Complete_Registration();
        reg_email.Set_password();
        reg_email.Set_ConfirmPassword();
        reg_email.Click_Change_Password();

    }
}
