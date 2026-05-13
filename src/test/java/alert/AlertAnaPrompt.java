package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertAnaPrompt {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Alert.html");

//        WebElement alert = driver.findElement(By.className("alert"));
//        alert.click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        String text = alert.getText();
//        System.out.println(text);


        WebElement prompt = driver.findElement(By.className("prompt"));
        prompt.click();
        Thread.sleep(2000);

        driver.switchTo().alert().sendKeys("Hello World!!");
        driver.switchTo().alert().accept();
        System.out.println(prompt.getText());
    }
}
