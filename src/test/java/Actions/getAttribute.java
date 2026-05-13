package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getAttribute {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Actions.html");

        String className = driver.findElement(By.name("firstName")).getAttribute("class");
        String type = driver.findElement(By.name("firstName")).getAttribute("type");
        String placeholder = driver.findElement(By.name("firstName")).getAttribute("placeholder");
        System.out.println(className);
        System.out.println(type);
        System.out.println(placeholder);
    }
}

