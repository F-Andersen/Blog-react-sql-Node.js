package My_Site;

import BasedPage.Based_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends Based_Page {
    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[text() = 'Name']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@class = 'email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@class = 'regpassword']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@class = 'regbutton']")
    private WebElement registerButton;

    @FindBy(xpath = "//div[contains(@class,'validation_type_password')/form-error/]")
    private WebElement ErrorText;

    @FindBy(xpath = "//div[contains(@class,'validation_type_password')]/form-error/p[contains(@class,'validation-message')]")
    private WebElement errorMassageText;


    public void registerNewUser(String username, String email, String password){
        userNameField.sendKeys(username);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        registerButton.click();
    }

    public String setErrorText(){
        return ErrorText.getText();
    }

    public boolean isErrorMassage(){
        return errorMassageText.isDisplayed();
    }

    public void registerEmail(String email){
        emailField.sendKeys(email);
    }

    public void registerName(String name){
        userNameField.sendKeys(name);
    }

    public void registerPassword(String password){
        passwordField.sendKeys(password);
    }

    public void buttonClick(){
        buttonClick();
    }
}
