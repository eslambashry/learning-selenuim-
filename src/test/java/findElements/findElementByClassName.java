package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("D:\\selenuim project one\\src\\test\\resources\\QAcart Selenium 101 course.html");

//        String container = driver.findElement(By.className("container")).getText();
//        System.out.println(container);
    }
}
