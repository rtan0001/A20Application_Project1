package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Declaration_Page extends BaseUtil {



    public Declaration_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void Click_NextPage_OnDeclarationPage()
    {
        driver.findElement(By.xpath("//*[@id='ServiceCommunityTemplate']/div[2]/div/div[3]/div/div/div[2]/button")).click();
    }


}
