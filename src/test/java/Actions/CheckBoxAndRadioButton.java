package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxAndRadioButton {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Actions.html");

        driver.findElement(By.id("automation")).click();
        driver.findElement(By.id("web")).click();
    }
}
