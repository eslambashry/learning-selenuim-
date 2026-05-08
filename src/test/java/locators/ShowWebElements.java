package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class ShowWebElements {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.saucedemo.com/");

//        WebElement welcomeHeader = driver.findElement(By.className("login_logo"));
//        System.out.println(welcomeHeader);
//        System.out.println(welcomeHeader.getText());

       // web elements

        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Locators.html");
       String text = driver.findElements(By.cssSelector(".wrapper li")).get(2).getText();
        System.out.println(text);


        List<WebElement> courses = driver.findElements(By.cssSelector(".wrapper li"));

        for (WebElement element : courses) {
            System.out.println(element.getText());
        }

    }
}
