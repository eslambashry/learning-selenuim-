import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openHTMLFile {
    public static void main(String[] args) {
        WebDriver diver = new ChromeDriver();

        // want to maxmize the screen
        diver.manage().window().maximize();

        // want to open html file
        diver.get("D:\\selenuim project one\\src\\test\\resources\\QAcart Selenium 101 course.html");


    }
}
