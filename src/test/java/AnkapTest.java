import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.net.URL;

public class AnkapTest {
    @Test
    public void FirstJenkinsTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joe\\Desktop\\Automation\\Delivery\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.ru");
    }
}
