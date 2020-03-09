package barclaysbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IeTesting {
    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk/";
        WebDriver driver = new InternetExplorerDriver();


        System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.quit();
        String title = driver.getTitle();
        driver.navigate().to("https://www.barclays.co.uk/");
        System.out.println("Main page" + title);
        driver.quit();

    }

}
