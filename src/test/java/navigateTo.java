import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateTo {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");

        driver.navigate().to("https://www.google.com");
        driver.navigate().forward(); //
        driver.navigate().refresh(); //
    }
}

