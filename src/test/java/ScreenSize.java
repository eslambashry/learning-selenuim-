import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenSize {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        String url = driver.getCurrentUrl();
        System.out.println("Current URL Is "+url);

//        String title = driver.getTitle();
//        System.out.println("Title is "+title);

        // to choose
//        Dimension IPhoneXR = new Dimension(414,896);
//        driver.manage().window().setSize(IPhoneXR);

        // To get page source
//          String pageSource = driver.getPageSource();

        driver.quit();  // close all opend window
//        driver.close(); // close only one window


    }
}
