package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateNew_Application_Update_Personal_Details_Page extends BaseUtil {



    public CreateNew_Application_Update_Personal_Details_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public Declaration_Page  Click_CreateNewButton() throws InterruptedException {

           Thread.sleep(2000);
           driver.findElement(By.xpath("//*[@id='ServiceCommunityTemplate']/div[2]/div/div[1]/div/div[2]/div/button")).click();
           Declaration_Page Dec_Page = new Declaration_Page(driver);

        return Dec_Page;

    }






}


