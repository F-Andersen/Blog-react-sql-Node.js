import My_Site.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.AssertJUnit.assertTrue;

public class BlogSite {

    WebDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    SignUpPage signUpPage;
    WelcomePage welcomePage;
    PostPage postPage;
    MakeScreenshot makeScreenshot;

    private String localhostname = "http://localhost:3000";
    private String localhostname1 = "https://ek.ua/ua/";

    @BeforeClass
    public void initDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void RegisterNewUser1(){
        String email = "testuser@gmail.com", password = "zxcvbnm1", name = "Oleg";
        driver.get(localhostname);
        welcomePage = new WelcomePage(driver);
        welcomePage.registerButton();
        signUpPage = new SignUpPage(driver);
        signUpPage.registerName(name);
        signUpPage.registerEmail(email);
        signUpPage.registerPassword(password);
        signUpPage.buttonClick();
    }

    @Test
    public void AddNewPost() throws IOException, InterruptedException {
        String email = "TEST@gmail.com", password = "qwerty12";
        String postname = "Test Name",postText = "Test text about interesting information";
        driver.get(localhostname);
        welcomePage = new WelcomePage(driver);
        welcomePage.loginUser();
        signInPage = new SignInPage(driver);
        signInPage.loginUser(password, email);
        homePage = new HomePage(driver);
        homePage.addNewPostText();
        postPage = new PostPage(driver);
        postPage.addNewPost(postname, postText);
        makeScreenshot.Screenshot(driver,"createPost");
    }

    @AfterClass
    public void endtestclass() {
        driver.quit();
    }

}
