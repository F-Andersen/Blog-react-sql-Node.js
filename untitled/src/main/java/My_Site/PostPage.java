package My_Site;

import BasedPage.Based_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostPage extends Based_Page {

    public PostPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class = 'text_field']")
    private WebElement textPostField;

    @FindBy(xpath = "//button[@class = 'name_field']")
    private WebElement namePostField;

    @FindBy(xpath = "//button[@class = 'postButton']")
    private WebElement addNewPostButton;

    public void addNewPost(String namePost, String textPost){
        namePostField.sendKeys(namePost);
        textPostField.sendKeys(textPost);
        addNewPostButton.click();
    }
}
