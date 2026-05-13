package Actions.About;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\About.html");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();


    }
}
