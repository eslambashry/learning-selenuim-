package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getSize {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Actions.html");
        driver.manage().window().maximize();

        Dimension size = driver.findElement(By.name("firstName")).getSize();
        System.out.println(size.width);
        System.out.println(size.height);

    }
}
