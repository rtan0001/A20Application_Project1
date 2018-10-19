package Steps;

import Base.BaseUtil;
import Pages.Add_And_Update_Personal_Details_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class Add_And_Update_Personal_Details_Steps extends BaseUtil {

    Add_And_Update_Personal_Details_Page personal_details = new Add_And_Update_Personal_Details_Page(driver);

//    @And("^I select ([^\"]*) from Where do you want to study dropdown$")
//    public void iSelectStudy_locationFromWhereDoYouWantToStudyDropdown(String location) throws Throwable {
//
//        personal_details.Select_Study_Place(location);
//
//    }


    @And("^I select ([^\"]*) from where do you want to study dropdown$")
    public void iSelectLocationFromWhereDoYouWantToStudyDropdown(String study_location) throws Throwable {
        Thread.sleep(3000);
        personal_details.Select_Study_Place(study_location);
    }


}
