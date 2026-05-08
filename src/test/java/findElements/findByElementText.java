package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class findByElementText {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\QAcart Selenium 101 course.html");

//        WebElement ElementByText = driver.findElement(By.linkText("Actions")); // used only for <a> links
//        System.out.println(ElementByText.getText());


        WebElement ElementByPartialText = driver.findElement(By.partialLinkText("This is a website that we will use ")); // used only for <a> links
        System.out.println(ElementByPartialText.getText());
    }
}
