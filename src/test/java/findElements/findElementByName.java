package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("D:\\selenuim project one\\src\\test\\resources\\QAcart Selenium 101 course.html");

        String description = driver.findElement(By.name("description")).getText();
        System.out.println(description);
    }
}
