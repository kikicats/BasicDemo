import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriver2 {

    public static void main(String[] args)
    {
        WebDriver driver ;
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        //driver.get("http://www.baidu.com");
        driver.navigate().to("http://www.bilibli.com");
        driver.close();
    }
}
