import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestRunner {

    @Test
    void testTitle(){
        String expectedTitle = "Your Sales Management System: LevelEleven";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    void homePageHeroTest(){
        WebElement homePageHero = driver.findElement(By.xpath("/html/body/section"));
        Assert.assertTrue(homePageHero.isDisplayed());
    }

    @Test
    void homePageHeroH1Test(){
        WebElement h1 = driver.findElement(By.xpath("/html/body/section/div/div/div/h1"));
        Assert.assertTrue(h1.isDisplayed());
    }

    @Test
    void freeDemoButtonTest(){
        WebElement demoButton = driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[1]/a"));
        Assert.assertTrue(demoButton.isDisplayed());
    }

    @Test
    void newFeaturesButtonTest(){
        WebElement newFeatures = driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[3]/a"));
        Assert.assertTrue(newFeatures.isDisplayed());
    }

    @Test
    void homePageHeroImgTest(){
        WebElement hhhImg = driver.findElement(By.xpath("/html/body/section/section/div/div/div[2]/div/img"));
        Assert.assertTrue(hhhImg.isDisplayed());
    }

    @Test
    void subHeroCopyTest(){
        WebElement subHero = driver.findElement(By.xpath("/html/body/section/section/div/div/div[1]"));
        Assert.assertTrue(subHero.isDisplayed());
    }

    @Test
    void habitStepsTest(){
        WebElement habitSteps = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[1]"));
        Assert.assertTrue(habitSteps.isDisplayed());
    }

    @Test
    void videoPlayerTest(){
        WebElement videoPlayer = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[1]/div[2]/video"));
        Assert.assertTrue(videoPlayer.isDisplayed());
    }

    @Test
    void learnMoreButtonTest(){
        WebElement learnMore = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[1]/div[3]/a"));
        Assert.assertTrue(learnMore.isDisplayed());
    }

    @Test
    void salesLibraryTest(){
        WebElement salesLibrary = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[2]"));
        Assert.assertTrue(salesLibrary.isDisplayed());
    }

    @Test
    void freeCopyTest(){
        WebElement freeCopy = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[2]/div/div[1]/div[3]/a"));
        Assert.assertTrue(freeCopy.isDisplayed());
    }

    @Test
    void performanceContentTest(){
        WebElement performContent = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[2]/div/div[2]/a"));
        Assert.assertTrue(performContent.isDisplayed());
    }

    @Test
    void containerTest(){
        WebElement container = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[3]/div[1]"));
        Assert.assertTrue(container.isDisplayed());
    }

    @Test
    void happyCustomersTest(){
        WebElement happyCustomers = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[3]/div[2]"));
        Assert.assertTrue(happyCustomers.isDisplayed());
    }

    @Test
    void customerStatsTest(){
        WebElement customerStats = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[3]/div[2]/div/div/div[1]"));
        Assert.assertTrue(customerStats.isDisplayed());
    }

    @Test
    void comcastTest(){
        WebElement comcast = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[3]/div[2]/div/div/div[3]/img"));
        Assert.assertTrue(comcast.isDisplayed());
    }

    @Test
    void googleTest(){
        WebElement google = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[3]/div[2]/div/div/div[3]/img"));
        Assert.assertTrue(google.isDisplayed());
    }

    @Test
    void paycorTest(){
        WebElement paycor = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[3]/div[2]/div/div/div[4]/img"));
        Assert.assertTrue(paycor.isDisplayed());
    }

    @Test
    void procoreTest(){
        WebElement procore = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[3]/div[2]/div/div/div[5]/img"));
        Assert.assertTrue(procore.isDisplayed());
    }

    @Test
    void wazeTest(){
        WebElement waze = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[3]/div[2]/div/div/div[6]/img"));
        Assert.assertTrue(waze.isDisplayed());
    }

    @Test
    void fiservTest(){
        WebElement fiserv = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/section[3]/div[2]/div/div/div[7]/img"));
        Assert.assertTrue(fiserv.isDisplayed());
    }

}
