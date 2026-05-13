package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getCssValue {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Actions.html");

        String color = driver.findElement(By.name("firstName")).getCssValue("color");
        String font_size = driver.findElement(By.name("firstName")).getCssValue("font-size");
        String display = driver.findElement(By.name("firstName")).getCssValue("display");
        System.out.println(color);
        System.out.println(font_size);
        System.out.println(display);

    }
}
