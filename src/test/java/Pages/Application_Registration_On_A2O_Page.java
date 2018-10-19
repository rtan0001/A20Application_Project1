package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.stream.Collectors;

public class Application_Registration_On_A2O_Page extends BaseUtil {

    //    public WebDriver driver;

//    GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);
//    public String email;


//    WebDriverWait wait = new WebDriverWait(GenerateRegoEmailStep.driver, 10);

    public static Set<String> windows ;

    public String email_text = null;

    public String title_text = null;

    public String full_Full_text = null;

    public String given = null;

    public String Family = null;

    public String email = null;








    public Application_Registration_On_A2O_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void Navigate_To_Mailinator()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mailinator.com/");
    }
    //
    public String Set_Email_In_Mailitanor() {

        Random rad = new Random();
        String email = null;
        for (int j = 1; j <= 1; j++) {
            System.out.println("rupa" + rad.nextInt(100));

            email = ("rupa" + rad.nextInt(100));

            System.out.println(email);

            driver.findElement(By.xpath("//*[@id='inboxfield']")).sendKeys(email);
        }

        return email;
    }

    public String Generate_random_mailinatorEmail()  throws InterruptedException {

        String names[] = {"carson.lane", "abdullahi.swan", "ezmae.hicks", "jonathon.halliday", "bryson.cantrell", "sharna.dodd", "wyatt.paine", "magdalena.neville" , "eloise.meadows" ,
                "milli.mcknight", "alesha.dawe", "mazie.cardenas", "cameron.farley", "lauren.drew", "jean.douglas", "betsy.guzman" , "sheldon.franco" , "pixie.silva" ,
                "hamza.hirst", "cristina.washington" , "tiegan.fletcher", "benny.busby", "roxie.heath" , "silas.taylor", "neive.mckee" , "darren.mccormick" , "shah.kerr",
                "jamelia.hatfield" , "clayton.lennon" , "aniela.hernandez" , "haleemah.haney" , "aislinn.evans" , "jada.knott" , "vivaan.bonilla" , "sahara.orozco" , "beth.mann", "jamie.hawkins",
                "Rima.Hartley" , "Georgiana.Zavala", "Russell.Adams",  "Mika.Molloy", "Patryk.Flowers", "Emilis.Melia", "Saad.Trujillo", "Hana.Kaiser", "Mark.Petersen",
                "jason.reeves", "reef.frye", "charley.farrow", "elwood.hulme", "humairaa.cordova", "ciara.byrne", "mikaela.bowman", "olli.holding", "charles.watt",
                "kaja.henry", "Kelly.Drew", "Grover.Gilbert", "Joy.Riggs", "Leo.Stacey" , "Noel.Allen", "Bethany.Fraser", "Gurveer.Donnelly" , "Siena.Burris" , "Tiah.Flower" ,
                "Jae.Blevins", "Lexie.Mcgill", "Kerys.Phan", "Madina.Schofield" , "Osian.Stubbs", "Ernie.Lane" , "Javier.Kirkland", "Jemima.Kemp", "Philippa.Montoya",
                "Anam.James", "Abul.East" , "Phoebe.Dickerson", "Sila.Stevens", "AmeliaRose.Miranda", "Kamila.OBrien" , "Gino.Orozco", "Ronan.Bannister", "Ziva.Pineda",
                "Bianca.Wong", "Eve.Gunn", "Samera.Mckee", "Zubair.White", "Aleeza.Church", "Garin.Duffy", "Emir.Burks", "Leena.Sheppard", "Tony.Worthington", "Daisy.Washington",
                "Kaylie.Haigh", "Arielle.Dorsey", "Jordan.Shaw", "Sol.Wells", "Zachary.Snow", "Kasey.Ballard", "Izabela.Major", "Kaidan.Kline", "Macauly.Oneill", "Nathanial.Wilkes",
                "Charleigh.Head","Sakina.Rossi", "Sheila.Schofield", "Wade.Mcknight", "Zakk.Berger", "Niko.Cannon", "Sami.Martinez", "Marlon.Lewis", "Mikayla.Dunne", "Guy.Galvan",
                "Millie.Clemons", "Rabia.Wong", "Maizie.Larson", "Kendall.Smith", "Malak.Wolfe", "Lenny.Carr", "Danyl.Wardle"
        };

        email_text = names[new Random().nextInt(names.length)];

        driver.findElement(By.xpath("//*[@id='inboxfield']")).sendKeys(email_text);
        return email_text;
    }



    public void  Click_GoButton()
    {
        driver.findElement(By.xpath("//*[@class='btn btn-dark']")).click();

    }

    public String Get_Title() {
//        String full_text = driver.findElement(By.xpath("//*[@title='This Inbox receives all email sent to this address']")).getText();

       String full_text = driver.findElement(By.xpath("//*[@id='inbox_page_title']/div[1]/div/div[2]/div")).getText();

       String[] text_split =  full_text.split(" ");
        String[] str_split = text_split[2].split("@");
//          String title_text = null;
        for (int i = 0; i < str_split.length; i++) {
            System.out.println(str_split[0]);
            title_text = str_split[0];
            break;
        }

        return title_text;
    }

    public String Get_Full_Title() {

        full_Full_text = driver.findElement(By.xpath("//*[@id='inbox_page_title']/div[1]/div/div[2]/div")).getText();

        String[] text_split =  full_Full_text.split(" ");

        return text_split[2];
    }


    public void Registration_Link_Click() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='centerPanel']/div/div[2]/div/div[4]/div/div[4]/span[2]/a")).click();
        Thread.sleep(2000);
    }




    public void set_GivenName_FamilyName_Email(String given, String Family, String email) throws InterruptedException {

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));

        WebElement item = driver.findElement(By.xpath("//*[@id='inbox_page_title']/div[1]/div/div[2]/div"));
        Actions act = new Actions(driver);
        act.moveToElement(item).click().build().perform();
        String  name    =  Get_Title();
        Thread.sleep(2000);
        String[] full_name = name.split("\\.");
        for(int i=0; i< full_name.length; i++)
        {
            given = full_name[0];
            Family= full_name[1];
        }
        Thread.sleep(2000);
        email =  Get_Full_Title();

        driver.switchTo().window(tabs.get(1));

        driver.findElement(By.xpath("//*[@placeholder='Given Name']")).sendKeys(given);
        driver.findElement(By.xpath("//*[@placeholder='Family Name']")).sendKeys(Family);
        driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys(email);
    }

    public void Click_On_SignUp_Button()
    {
        driver.findElement(By.xpath("//*[@id='centerPanel']/div/div[2]/div/div[4]/div/div[5]/button")).click();

    }

    public void  Set_Created_Email_into_Inbox(String created_email)
    {
        driver.findElement(By.xpath("//*[@id='inboxfield']")).sendKeys(created_email);
    }


    // Set email id into Gmail account login page
    public void Set_Email_GmailAccount(String email)
    {
        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(email);
    }

    // Click Next button from the Gmail Login Page
    public void Click_NextButton()
    {
        driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();

    }

    public void Click_NextButton_Password()
    {
        driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
    }



    //Set Password and click Next button to login into gmail account
    public void Set_Password_GmailPage(String password)
    {
        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).click();
        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
    }


    public void Click_Welcome_Email() throws InterruptedException

    {

        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@ng-repeat='email in emails']/td[3]")));

        element.click();




    }
    public void Click_Complete_Registration() throws InterruptedException

    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='msgpane']")));
        element.click();

        Thread.sleep(3000);

        driver.switchTo().frame("msg_body");

        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/a")).click();

//
//        List<WebElement> elements = element.findElements(By.tagName("td"));
//
//        for(WebElement ele_links: elements)
//        {
//            if(ele_links.getText().equals("Complete Registration"))
//            {
//                ele_links.click();
//            }
//        }

//         element.click();



    }


    public String Get_textEmailFrom_WelcomePage() throws InterruptedException {

//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='msgpane']")));
//        element.click();

        Thread.sleep(3000);

//        driver.switchTo().frame("msg_body");

        driver.findElement(By.xpath("//*[@id='query_data']/div[4]")).click();
        String webtext = driver.findElement(By.xpath("//*[@id='query_data']/div[4]")).getText();

        return webtext;
    }

    public static void setWindows()
    {
        windows = new HashSet<String>();
        driver.getWindowHandles().stream().forEach(n -> windows.add(n));
    }

    public static String getWindow()
    {
        windows = new HashSet<String>();
        List<String> newWindow = driver.getWindowHandles().stream()
                .filter(n -> !windows.contains(n)).collect(Collectors.toList());
        System.out.println(newWindow.get(1));
        return newWindow.get(1);
    }

    public static String getWindow_First()
    {
        windows = new HashSet<String>();
        List<String> newWindow1 = driver.getWindowHandles().stream()
                .filter(n -> !windows.contains(n)).collect(Collectors.toList());
        System.out.println(newWindow1.get(0));
        return newWindow1.get(0);
    }



    public void  Set_password() throws InterruptedException {

        Thread.sleep(9000);

        String newwindow = getWindow();
        driver.switchTo().window(newwindow);

        driver.findElement(By.xpath("//*[@id='content']")).click();
        driver.findElement(By.xpath("//*[@id='editPage']/div[1]/label[1]")).click();
        driver.findElement(By.xpath("//*[@id='editPage']/div[1]/div[1]/input")).sendKeys("monash@2017");
    }

    public void  Set_ConfirmPassword()
    {

        driver.findElement(By.xpath("//*[@id='editPage']/div[1]/label[2]")).click();
        driver.findElement(By.xpath("//*[@id='editPage']/div[1]/div[2]/input")).sendKeys("monash@2017");

    }

    public void  Click_Change_Password() throws InterruptedException {

//        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='password-button']")).click();

        Thread.sleep(4000);
    }


    public void Click_Logout() throws InterruptedException {
        //*[@class=" profileIcon"]



        windows = new HashSet<String>();

        String newwindow = getWindow();
        driver.switchTo().window(newwindow);

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class=' profileIcon']")).click();

        WebElement element = driver.findElement(By.xpath("//*[@id='header-overlay']/div[1]/div[5]/div/div/div/div[2]/div/ul"));

        List<WebElement> list_items = element.findElements(By.tagName("li"));

        for (WebElement items : list_items) {
            if (items.getText().trim().equals("Logout")) {
                Actions act = new Actions(driver);
                act.moveToElement(items).click().build().perform();

            }

        }
    }






}
