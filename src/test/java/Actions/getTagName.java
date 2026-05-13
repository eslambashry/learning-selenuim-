package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getTagName {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Actions.html");

        String className = driver.findElement(By.name("firstName")).getTagName();
        System.out.println(className);

    }
}
