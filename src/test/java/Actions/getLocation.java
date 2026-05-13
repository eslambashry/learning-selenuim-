package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getLocation {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Actions.html");

        Point location = driver.findElement(By.name("firstName")).getLocation();
        Point location_x = driver.findElement(By.name("firstName")).getLocation();
        Point location_y = driver.findElement(By.name("firstName")).getLocation();
        System.out.println(location);
        System.out.println(location_x.x + " " + location_x.y);
        System.out.println(location_y.y + " " + location_y.x);

    }
}
