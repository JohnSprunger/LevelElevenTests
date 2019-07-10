import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ProductTourTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://leveleleven.com/product-tour/");
    }

    @AfterClass
    void teardown(){
        driver.quit();
    }

    @Test
    void testTitle(){
        String expectedTitle = "Product Tour - LevelEleven";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    void blueOverlayTest(){
        WebElement blueOverlay = driver.findElement(By.xpath("//*[@id=\"template-product-tour\"]/div/div[3]"));
        Assert.assertTrue(blueOverlay.isDisplayed());
    }

    @Test
    void readStoriesButtonTest(){
        WebElement readStoriesButton = driver.findElement(By.xpath("//*[@id=\"template-product-tour\"]/div/div[1]/div/div/a"));
        Assert.assertTrue(readStoriesButton.isDisplayed());
    }

    @Test
    void secondMenuTest(){
        WebElement secondMenu = driver.findElement(By.xpath("//*[@id=\"template-product-tour\"]/section[1]/div[2]/div/div"));
        Assert.assertTrue(secondMenu.isDisplayed());
    }

    @Test
    void heroHeaderTest(){
        WebElement heroHeader = driver.findElement(By.xpath("//*[@id=\"platformOverview\"]/section[1]"));
        Assert.assertTrue(heroHeader.isDisplayed());
    }

    @Test
    void toolsTest(){
        WebElement tools = driver.findElement(By.xpath("//*[@id=\"platformOverview\"]/section[2]"));
        Assert.assertTrue(tools.isDisplayed());
    }

    @Test
    void motivateTest(){
        WebElement motivate = driver.findElement(By.xpath("//*[@id=\"platformOverview\"]/section[2]/div/div[2]/div[1]/div/div[1]"));
        Assert.assertTrue(motivate.isDisplayed());
    }

    @Test
    void coachTest(){
        WebElement coach = driver.findElement(By.xpath("//*[@id=\"platformOverview\"]/section[2]/div/div[2]/div[3]/div/div[1]"));
        Assert.assertTrue(coach.isDisplayed());
    }

    @Test
    void engageTest(){
        WebElement engage = driver.findElement(By.xpath("//*[@id=\"platformOverview\"]/section[2]/div/div[2]/div[2]/div/div[1]"));
        Assert.assertTrue(engage.isDisplayed());
    }

    @Test
    void learn1Test(){
        WebElement learn1 = driver.findElement(By.xpath("//*[@id=\"platformOverview\"]/section[2]/div/div[2]/div[1]/div/div[2]/div/a"));
        Assert.assertTrue(learn1.isDisplayed());
    }

    @Test
    void learn2Test(){
        WebElement learn2 = driver.findElement(By.xpath("//*[@id=\"platformOverview\"]/section[2]/div/div[2]/div[2]/div/div[2]/div/a"));
        Assert.assertTrue(learn2.isDisplayed());
    }

    @Test
    void learn3Test(){
        WebElement learn3 = driver.findElement(By.xpath("//*[@id=\"platformOverview\"]/section[2]/div/div[2]/div[3]/div/div[2]/div/a"));
        Assert.assertTrue(learn3.isDisplayed());
    }
}
