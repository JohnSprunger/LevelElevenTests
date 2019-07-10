import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderFooterTest extends TestRunner{
    @Test
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("/html/body/header/div[2]/div/div[1]/a/img"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    void navbarTest(){
        WebElement navbar = driver.findElement(By.xpath("/html/body/header/div[2]"));
        Assert.assertTrue(navbar.isDisplayed());
    }

    @Test
    void freeDemoButtonTest(){
        WebElement freedemo = driver.findElement(By.xpath("//*[@id=\"menu-header-nav-1\"]/li[7]/a"));
        Assert.assertTrue(freedemo.isDisplayed());
    }

    @Test
    void careersLinkTest(){
        WebElement careers = driver.findElement(By.xpath("//*[@id=\"menu-header-nav-1\"]/li[6]/a"));
        Assert.assertTrue(careers.isDisplayed());
    }

    @Test
    void eventsLinkTest(){
        WebElement events = driver.findElement(By.xpath("//*[@id=\"menu-header-nav-1\"]/li[5]/a"));
        Assert.assertTrue(events.isDisplayed());
    }

    @Test
    void blogLinkTest(){
        WebElement blog = driver.findElement(By.xpath("//*[@id=\"menu-header-nav-1\"]/li[4]/a"));
        Assert.assertTrue(blog.isDisplayed());
    }

    @Test
    void resourcesLinkTest(){
        WebElement resources = driver.findElement(By.xpath("//*[@id=\"menu-header-nav-1\"]/li[3]/a"));
        Assert.assertTrue(resources.isDisplayed());
    }

    @Test
    void aboutusLinkTest(){
        WebElement aboutus = driver.findElement(By.xpath("//*[@id=\"menu-header-nav-1\"]/li[2]/a"));
        Assert.assertTrue(aboutus.isDisplayed());
    }

    @Test
    void productTourLinkTest(){
        WebElement productTour = driver.findElement(By.xpath("//*[@id=\"menu-header-nav-1\"]/li[1]/a"));
        Assert.assertTrue(productTour.isDisplayed());
    }

    @Test
    void footerLinksTest(){
        WebElement footer = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/footer/section[1]"));
        Assert.assertTrue(footer.isDisplayed());
    }

    @Test
    void emailDescTest(){
        WebElement emailDescription = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/footer/section[1]/div/div/div[1]/div/p"));
        Assert.assertTrue(emailDescription.isDisplayed());
    }

    @Test
    void emailInputTest(){
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"672783_747pi_672783_747\"]"));
        Assert.assertTrue(emailInput.isDisplayed());
    }

    @Test
    void emailLabelTest(){
        WebElement emailLabel = driver.findElement(By.xpath("//*[@id=\"pardot-form\"]/div/label"));
        Assert.assertTrue(emailLabel.isDisplayed());
    }

    @Test
    void emailButtonTest(){
        WebElement emailButton = driver.findElement(By.xpath("//*[@id=\"pardot-form\"]/p[2]/input"));
        Assert.assertTrue(emailButton.isDisplayed());
    }

    @Test
    void socialMediaDivTest(){
        WebElement socialMedia = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/footer/section[1]/div/div/div[2]/div/div[3]/div"));
        Assert.assertTrue(socialMedia.isDisplayed());
    }

    @Test
    void twitterTest(){
        WebElement twitter = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/footer/section[1]/div/div/div[2]/div/div[3]/div/ul/li[1]/a/span/i[2]"));
        Assert.assertTrue(twitter.isDisplayed());
    }

    @Test
    void facebookTest(){
        WebElement facebook = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/footer/section[1]/div/div/div[2]/div/div[3]/div/ul/li[2]/a/span/i[2]"));
        Assert.assertTrue(facebook.isDisplayed());
    }

    @Test
    void linkedinTest(){
        WebElement linkedin = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/footer/section[1]/div/div/div[2]/div/div[3]/div/ul/li[3]/a/span/i[2]"));
        Assert.assertTrue(linkedin.isDisplayed());
    }

    @Test
    void googleplusTest(){
        WebElement google = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/footer/section[1]/div/div/div[2]/div/div[3]/div/ul/li[4]/a/span/i[2]"));
        Assert.assertTrue(google.isDisplayed());
    }

    @Test
    void footerLogoTest(){
        WebElement footerLogo = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/footer/section[2]/div/div/div[2]/div[1]/img"));
        Assert.assertTrue(footerLogo.isDisplayed());
    }

    @Test
    void copyrightTest(){
        WebElement copyright = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/footer/section[2]/div/div/div[2]/div[2]"));
        Assert.assertTrue(copyright.isDisplayed());
    }

    @Test
    void madewithluvTest(){
        WebElement heart = driver.findElement(By.xpath("//*[@id=\"template-front-page\"]/footer/section[2]/div/div/div[1]/p"));
        Assert.assertTrue(heart.isDisplayed());
    }
}