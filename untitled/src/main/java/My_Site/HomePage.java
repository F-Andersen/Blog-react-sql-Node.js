package My_Site;

import BasedPage.Based_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Based_Page {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class = 'postButton']")
    private WebElement addNewPostButton;

    public void addNewPostText(){
        addNewPostButton.click();
    }

}
