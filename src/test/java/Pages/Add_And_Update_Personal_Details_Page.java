package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

public class Add_And_Update_Personal_Details_Page extends BaseUtil{

    public Add_And_Update_Personal_Details_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Select_Study_Place(String study_location)
    {

       WebElement location_Study =  driver.findElement(By.xpath("//*[@id='ServiceCommunityTemplate']/div[2]/div/div[2]/div/div[4]/div[3]/div[1]/div/select"));

       List<WebElement> list_items =  location_Study.findElements(By.tagName("option"));

        label :  for(WebElement items :list_items)
          {
          if(items.getText().equals(study_location))
          {
              items.click();
              break label;
          }
          }

    }

    public void Click_NextPage_PersonalDetails()
    {
            driver.findElement(By.xpath("//*[@id='ServiceCommunityTemplate']/div[2]/div/div[3]/div/div/div[2]/button[2]")).click();

    }



}
