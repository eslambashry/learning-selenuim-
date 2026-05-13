package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getRegtangle {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        Rectangle firstName = driver.findElement(By.name("firstName")).getRect();
        System.out.println(firstName.getX());
        System.out.println(firstName.getY());
    }
}
