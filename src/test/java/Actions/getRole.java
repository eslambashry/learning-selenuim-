package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getRole {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Actions.html");
        driver.manage().window().maximize();
        String text_box = driver.findElement(By.name("firstName")).getAriaRole();
        System.out.println(text_box);

        String radio = driver.findElement(By.name("category")).getAriaRole();
        System.out.println(radio);
    }
}
