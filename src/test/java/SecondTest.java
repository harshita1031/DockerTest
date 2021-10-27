import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest{

    @Test
    public void secondTest() throws InterruptedException{
        System.out.println("Test 2 Started!");
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
        System.out.println("Test2 page title is: "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
        System.out.println("Test 2 Ended!");
    }
}
