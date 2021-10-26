import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class BaseTest {
    WebDriver driver;
    String nodeURL;

    @BeforeTest
    @Parameters(value={"browser"})
    public void setup(String browser) throws MalformedURLException{
        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            nodeURL = "http://127.0.0.1:4444";
            driver = new RemoteWebDriver(new URL(nodeURL),options);
        }
        else{
            FirefoxOptions options = new FirefoxOptions();
            nodeURL = "http://127.0.0.1:4445";
            driver = new RemoteWebDriver(new URL(nodeURL), options);
        }
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}