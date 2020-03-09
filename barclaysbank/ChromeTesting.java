package barclaysbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeTesting {
    public static void main(String[] args) {
        String baseUrl="https://www.barclays.co.uk/";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.quit();
        String title=driver.getTitle();
        driver.navigate().to("https://www.barclays.co.uk/");
        System.out.println("Main page"+title);
        driver.quit();

    }
}
