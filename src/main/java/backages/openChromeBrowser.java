package backages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChromeBrowser {
    public static void main(String[] args) {
        System.out.println("Hellow selenuim");
        System.setProperty("Name","eslam");
                    System.out.println();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}