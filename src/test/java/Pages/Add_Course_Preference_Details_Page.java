package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Add_Course_Preference_Details_Page extends BaseUtil {


    public Add_Course_Preference_Details_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Set_CourseCode() throws InterruptedException
    {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@placeholder='Enter course code or name']")).click();
        driver.findElement(By.xpath("//*[@placeholder='Enter course code or name']")).sendKeys("master");

    }

    public void SearchButton_Click()
    {
        driver.findElement(By.xpath("//*[@id='searchCourse']/div[1]/form/div[2]/div/button")).click();
    }

    public void Select_List_CourseCodes() throws InterruptedException
    {
        Thread.sleep(3000);

        WebElement table_collection = driver.findElement(By.xpath("//*[@id='courseList']/table"));
        List<WebElement> rows = table_collection.findElements(By.tagName("tr"));
        int row_Count = rows.size();
        System.out.println("Number of rows:"+ row_Count);

        for(int i=0; i<=row_Count-19 ;i++) {

           List<WebElement> elements = driver.findElements(By.xpath("//*[@type='checkbox']"));
           elements.get(i).click();

        }
    }

    public void Add_Courses() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='courseList']/div[3]/button[1]")).click();
    }


    public void CloseSearch_Click() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='courseList']/div[3]/button[2]")).click();

    }

    public void Delete_Course_Pref() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='appCourseTable']/tbody/tr[1]/th/div/button")).click();
    }

    public void Click_NextPage_CoursePreference()
    {
        driver.findElement(By.xpath("//*[@id='ServiceCommunityTemplate']/div[2]/div/div[3]/div/div/div[2]/button")).click();
    }


}
