import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest{

    @Test
    public void firstTest() throws InterruptedException{
        System.out.println("Test 1 Started!");
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        System.out.println("Test1 page title is: "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Test 1 Ended!");
    }
}