package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElementByTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("D:\\selenuim project one\\src\\test\\resources\\QAcart Selenium 101 course.html");

//        String title = driver.findElement(By.tagName("title")).getText();
//        System.out.println(title);

//        List<WebElement> h1List = driver.findElements(By.tagName("h1"));
//        for (int i=0 ; i<h1List.size() ; i++){
//        System.out.println(h1List.get(i).getText());
//        }
    }
}
