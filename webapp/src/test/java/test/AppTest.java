package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CodeMind;

public class AppTest {
    private WebDriver driver;
    protected CodeMind codemind;

    @BeforeTest
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\T-HUB\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions o= new ChromeOptions();
        o.addArguments("--remote-allow-origins=*");

        /*o.addArguments("--incognito");
        DesiredCapabilities c = DesiredCapabilities.chrome();
        c.setCapability(ChromeOptions.CAPABILITY, o);*/

        WebDriver driver = new ChromeDriver(o);
        driver.manage().window().maximize();
        codemind = new CodeMind(driver);

        /*driver = new ChromeDriver();
        driver.manage().window().maximize();
        codemind = new CodeMind(driver);*/
    }

    @Test
    public void VerifyLogin() throws InterruptedException {
        codemind.codemind();
        codemind.Login();
        codemind.Portfolio();
        codemind.Code_portfolio();
        codemind.Code_experimenter();
        codemind.Code_competitor_C();
        codemind.Code_competitor_Python();
        codemind.Code_competitor_Java();
        codemind.Logical_Explorer();
        codemind.Logical_Experimenter();
        //codemind.Logical_Compititor();
        codemind.technical_Learningpath();
        codemind.technical_Technologies();
        codemind.technical_Explorer();
        codemind.technical_Experimenter();

    }

    @AfterTest
    public void close() throws InterruptedException{
        Thread.sleep(Long.parseLong("1000"));
        codemind.close();
    }
}
