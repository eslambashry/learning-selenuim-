package Actions.About;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\About.html");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        WebElement button = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(button).perform();

    }
}
