package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class newWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Windows.html");


        String parentWindow = driver.getWindowHandle();

//        System.out.println("Parent Window Handle: " + parentWindow);
        driver.findElement(By.linkText("Youtube")).click();
//        driver.findElement(By.linkText("Official Website")).click();

        Set<String> ALLWindow = driver.getWindowHandles();
//        System.out.println("All Window Handles: " + ALLWindow);

        for (String window : ALLWindow) {
            if(!window.equals(parentWindow)){
                System.out.println(driver.getTitle());
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());

            }
//                System.out.println(window +" "+ driver.getWindowHandle());
//                System.out.println(driver.getWindowHandle());
        }
//        System.out.println("Parent Window Handle: " + driver.getWindowHandle());
//        driver.findElement(By.linkText("Youtube")).click();
//        System.out.println("Parent Window Handle: " + driver.getWindowHandle());
    }
}
