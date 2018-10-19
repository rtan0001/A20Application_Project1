package Steps;

import Base.BaseUtil;
import Pages.Add_Course_Preference_Details_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class Add_Course_Preference_Details_Steps   extends BaseUtil {

    Add_Course_Preference_Details_Page CoursePref_Page = new Add_Course_Preference_Details_Page(driver);




    @And("^I select and Added courses from the given list$")
    public void iSelectAndAddedCoursesFromTheGivenList() throws Throwable {

        Thread.sleep(2000);
        CoursePref_Page.Select_List_CourseCodes();
        CoursePref_Page.Add_Courses();
    }


    @And("^I Close Search function$")
    public void iCloseSearchFunction() throws Throwable {

        Thread.sleep(2000);
        CoursePref_Page.CloseSearch_Click();

    }


    @And("^I Edit and Update the Course Preference and then Save$")
    public void iEditAndUpdateTheCoursePreferenceAndThenSave() throws Throwable {


    }

    @Given("^I entered Course Code or name then click search should give full list of courses$")
    public void iEnteredCourseCodeOrNameThenClickSearchShouldGiveFullListOfCourses() throws Throwable {
        Thread.sleep(2000);
        CoursePref_Page.Set_CourseCode();
        CoursePref_Page.SearchButton_Click();
        Thread.sleep(3000);
    }


    @When("^I click NextPage it will Navigate to the Education History page$")
    public void iClickNextPageItWillNavigateToTheEducationHistoryPage() throws Throwable {

        CoursePref_Page.Click_NextPage_CoursePreference();
        Thread.sleep(3000);


    }

    @And("^I can be able to Delete the Course Preference then preference should be changed$")
    public void iCanBeAbleToDeleteTheCoursePreferenceThenPreferenceShouldBeChanged() throws Throwable {

        CoursePref_Page.Delete_Course_Pref();
        Thread.sleep(2000);

    }
}
