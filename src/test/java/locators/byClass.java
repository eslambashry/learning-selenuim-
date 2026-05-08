package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class byClass {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
// By class to initialize variable
        By welcomeHeader = By.id("password");

        String element = driver.findElement(welcomeHeader).getText();

        System.out.println(welcomeHeader);
        System.out.println(element);

    }
}
