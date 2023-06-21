package My_Site;

import BasedPage.Based_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends Based_Page {

    public WelcomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class = 'login']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[@class = 'register']")
    private WebElement registerButton;

    public void loginUser(){
        loginButton.click();
    }

    public void registerButton(){
        registerButton.click();

    }

}
