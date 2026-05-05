package backages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openFireFoxBrowser {
    public static void main(String[] args){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");

//        to visit any website with selenium
        driver.get("https://youtube.com");
    }
}
