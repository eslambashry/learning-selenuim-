package Actions.About;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHold {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\About.html");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebElement source = driver.findElement(By.id("dragItem"));
        WebElement drop = driver.findElement(By.id("dropZone"));

        action.clickAndHold(source).moveToElement(drop).release().build().perform();

    }
}
