package Steps;

import Base.BaseUtil;
import Pages.App_Login_Page;
import Pages.Applicant_MyDetails_Page;
import Pages.Application_Registration_On_A2O_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;

import static Pages.Application_Registration_On_A2O_Page.getWindow_First;

public class Applicant_MyDetails_Steps extends BaseUtil {

    Applicant_MyDetails_Page page2 = new Applicant_MyDetails_Page(driver);
    Application_Registration_On_A2O_Page reg_email = new Application_Registration_On_A2O_Page(driver);
//    App_Login_Page Login_Page = new App_Login_Page(driver);

    public String username;





    @And("^I entered username and password$")
    public void iEnteredUsernameAndPassword() throws Throwable {

        initialization();
        driver.get("https://sit-monashpartner.cs31.force.com/admissions/s/login/");
        driver.manage().window().maximize();



        Thread.sleep(5000);
//        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));


        App_Login_Page Login_Page = new App_Login_Page(driver);
       Login_Page.Login("sol.wells@mailinator.com", "monash@2017");

//        Login_Page.Login(username, "monash@2017");

    }



    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        App_Login_Page page = new App_Login_Page(driver);
        page.ClickLogin();
        Thread.sleep(12000);
    }




    @And("^I navigate to the details ([^\"]*) page$")
    public void iNavigateToTheDetailsMyDetailsPage(String DetailsLink) throws Exception {
        Thread.sleep(10000);
        driver.manage().window().maximize();

//         MyDetailsPage page2 = new MyDetailsPage(driver);
//       MyDetailsPage page2 =  PageFactory.initElements(driver, MyDetailsPage.class);
//         page2.Click_MyDetails_Link(DetailsLink);
        page2.Click_MyDetails_Link(DetailsLink);

    }


    @And("^I Select title from page ([^\"]*)$")
    public void iSelectTitleFromPageTitle(String title) throws Exception {

        page2.select_title(title);


    }

    @Then("^I Click on Save button$")
    public void iClickOnSaveButton() throws Exception {

    }

    @And("^I Select gender ([^\"]*)$")
    public void iSelectGenderGender(String gender) throws Exception {

        page2.Select_Gender(gender);

    }

    @And("^I Set dateofbirth ([^\"]*)$")
    public void iSetDateofbirthDateOfBirth(String Dateofbirth) throws Exception {

        page2.Enter_DateOfBirth(Dateofbirth);

    }

    @And("^I Set mobilenumber ([^\"]*)$")
    public void iSetMobilenumberMobileNumber(String mobilenumber) throws Exception {

        page2.Set_Mobile(mobilenumber);

    }

    @And("^I Set homephone ([^\"]*)$")
    public void iSetHomephoneHomePhone(String homephone) throws Exception {

        page2.Set_HomePhone(homephone);


    }

    @And("^I Set workphone ([^\"]*)$")
    public void iSetWorkphoneWorkPhone(String worhphone) throws Exception {

        page2.Set_WorkPhone(worhphone);

    }

    @And("^I Set currentpostal ([^\"]*)$")
    public void iSetCurrentphoneCurrentPostal(String postalAddress) throws Exception {

        page2.Select_PostalAddress(postalAddress);

    }

    @And("^I Set streetnumber ([^\"]*)$")
    public void iSetStreetnumberStreetNumber(String street) throws Exception {

        page2.Set_StreetNumber(street);

    }

    @And("^I Set suburb ([^\"]*)$")
    public void iSetSuburbSuburb(String suburb) throws Exception {

        page2.Set_Suburb(suburb);

    }

    @And("^I Set state ([^\"]*)$")
    public void iSetStateState(String state) throws Exception {

        page2.Select_State(state);

    }

    @And("^I Set postalcode ([^\"]*)$")
    public void iSetPostalcodePostalCode(String postalcode) throws Exception {

        page2.Set_PostCode(postalcode);

    }

    @And("^I Set location ([^\"]*)$")
    public void iSetLocationLocation(String location) throws Exception {

        page2.Select_Location(location);

    }

    @And("^I Set citizenship ([^\"]*)$")
    public void iSetCitizenshipCitizenShipType(String citizenship) throws Exception {

        page2.Select_CitizenShip(citizenship);

    }


    @When("^I Click on Save button to save the details$")
    public void iClickOnSaveButtonToSaveTheDetails() throws Exception {

        page2.Click_SaveButton();

        Thread.sleep(3500);


    }

    @Given("^I navigate to mailinator window to get email$")
    public void iNavigateToMailinatorWindowToGetEmail() throws Throwable {

        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        username = reg_email.Get_Full_Title();
        System.out.println(username);
        Thread.sleep(2000);

    }

    @And("^I Set disability ([^\"]*)$")
    public void iSetDisabilityDisabilityCheck(String disability) throws Throwable {
        page2.Select_Disability(disability);
    }


}
