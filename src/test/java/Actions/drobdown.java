package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class drobdown {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Actions.html");

        Select Dropdown = new Select(driver.findElement(By.id("level")));
        Dropdown.selectByValue("senior");
//        Dropdown.selectByVisibleText("Junior");

    }
}
