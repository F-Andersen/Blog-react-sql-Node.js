package BasedPage;

import org.openqa.selenium.WebDriver;

public abstract class Based_Page {

    protected WebDriver driver;

    public Based_Page(WebDriver driver){
        this.driver = driver;
    }

}
