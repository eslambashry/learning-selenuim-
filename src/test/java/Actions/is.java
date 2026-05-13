package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class is {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Actions.html");

        boolean isDisplayed = driver.findElement(By.name("firstName")).isDisplayed();
        System.out.println(isDisplayed);

        // cant press on it (cant access it)
        boolean isEnabled = driver.findElement(By.name("firstName")).isEnabled();
        System.out.println(isEnabled);

        boolean isSelected = driver.findElement(By.id("mobile")).isSelected();
        System.out.println(isSelected);

    }
}
