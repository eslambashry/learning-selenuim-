package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementById {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("D:\\selenuim project one\\src\\test\\resources\\QAcart Selenium 101 course.html");

        String h1 = driver.findElement(By.id("welcome")).getText();
        System.out.println(h1);
    }
}
