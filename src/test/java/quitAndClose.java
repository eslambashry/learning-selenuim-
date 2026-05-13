import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class quitAndClose {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Windows.html");


        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.linkText("Official Website")).click();

        Set<String> ALLWindow = driver.getWindowHandles();

        for (String window : ALLWindow) {
            if (!window.equals(parentWindow)) {
//                System.out.println(driver.getTitle());
                driver.switchTo().window(window);
//                System.out.println(driver.getTitle());
//                driver.quit(); // close all taps
                Thread.sleep(3000);
                driver.close(); // close one tap
            }
        }


    }
}
