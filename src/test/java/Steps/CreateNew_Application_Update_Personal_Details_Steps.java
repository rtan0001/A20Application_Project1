package Steps;

import Base.BaseUtil;
import Pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CreateNew_Application_Update_Personal_Details_Steps extends BaseUtil {

    Applicant_MyDetails_Page page2 = new Applicant_MyDetails_Page(driver);

    CreateNew_Application_Update_Personal_Details_Page home_page = new CreateNew_Application_Update_Personal_Details_Page(driver);

    Declaration_Page Decl_Page = new Declaration_Page(driver);

    Add_And_Update_Personal_Details_Page personal_details = new Add_And_Update_Personal_Details_Page(driver);

    @Given("^I navigate to the home ([^\"]*) page$")
    public void i_navigate_to_the_home_Home_page(String home_link) throws Throwable {

        Thread.sleep(2000);
//      String newwindow = getWindow();
//      driver.switchTo().window(newwindow);
        page2.Click_MyDetails_Link(home_link);
        Thread.sleep(3000);

    }


    @And("^I click Create New Application button then Navigates to the initial Declaration Page$")
    public void iClickCreateNewApplicationButtonThenNavigatesToTheInitialDeclarationPage() throws Throwable {

        home_page.Click_CreateNewButton();
        Thread.sleep(4000);

    }

    @And("^Click Next to go the Personal Details Page$")
    public void clickNextToGoThePersonalDetailsPage() throws Throwable {

        Thread.sleep(2000);
        Decl_Page.Click_NextPage_OnDeclarationPage();

    }

    @And("^Click Next to go to the Course Preference Page$")
    public void clickNextToGoToTheCoursePreferencePage() throws Throwable {
        Thread.sleep(3000);
        personal_details.Click_NextPage_PersonalDetails();

    }


}
