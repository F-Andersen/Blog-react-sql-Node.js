package My_Site;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class MakeScreenshot {
    private WebDriver driver;
    public void Screenshot(WebDriver driver, String nameFile) throws IOException, InterruptedException {
        this.driver = driver;
        Thread.sleep(2000);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String filePath = "C:QA_AT/untitled/screenshot" + nameFile;
        FileUtils.copyFile(srcFile, new File(filePath));

    }

}
