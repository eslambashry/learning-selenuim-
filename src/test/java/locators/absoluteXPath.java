package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class absoluteXPath {
    public static void main(String[] args) {
       WebDriver driver = new EdgeDriver();
       driver.get("C:\\Games\\selenuim project one\\src\\test\\resources\\Locators.html");
//
////        $x("//html/body/div/div/ul/li[1]") => (2) [li#selenium.button.course.web, li.button.course.web]
//
//
//// ✅ 1. Absolute XPath (مش مفضل ❌)


//        String element = driver.findElement(By.xpath("/html/body/div/div/ul/li")).getText();
//        System.out.println(element);


////⚠️ حساس جدًا لأي تغيير
//
////✅ 2. Relative XPath (المهم ✅)
        //driver.findElement(By.xpath("//ul"));
////✅ 3. By Tag Name
////        driver.findElements(By.xpath("//li"));
////✅ 4. By Attribute
////✔️ باستخدام id
//        driver.findElement(By.xpath("//li[@id='selenium']"));
////✔️ باستخدام name
//        driver.findElement(By.xpath("//li[@name='appium']"));
////✔️ باستخدام data-testid
     String element =  driver.findElement(By.xpath("//li[@data-testid='cypress']")).getText();
        System.out.println(element);

////✅ 5. contains() (جزء من القيمة)

//        driver.findElement(By.xpath("//li[contains(@class,'mobile')]"));
////✅ 6. text()
//        driver.findElement(By.xpath("//li[text()='Selenium']"));
////✅ 7. contains(text())
//        driver.findElement(By.xpath("//li[contains(text(),'Selen')]"));
////✅ 8. AND condition
//        driver.findElement(By.xpath("//li[@class='button course web' and @id='selenium']"));
////✅ 9. OR condition
//        driver.findElement(By.xpath("//li[@id='selenium' or @name='appium']"));
////✅ 10. Index (position)
////        أول عنصر
//        driver.findElement(By.xpath("(//li)[1]"));
////        تالت عنصر
//        driver.findElement(By.xpath("(//li)[3]"));
////✅ 11. Parent → Child
//        driver.findElement(By.xpath("//ul[@class='wrapper']/li"));
////✅ 12. Child → Parent
//        driver.findElement(By.xpath("//li[@id='selenium']/parent::ul"));
////✅ 13. Following sibling
//        driver.findElement(By.xpath("//li[@id='selenium']/following-sibling::li"));
////✅ 14. Previous sibling
//        driver.findElement(By.xpath("//li[@name='appium']/preceding-sibling::li"));
////✅ 15. Starts-with
//        driver.findElement(By.xpath("//li[starts-with(text(),'Sel')]"));
////✅ 16. Select specific UL
//        driver.findElement(By.xpath("(//ul[@class='wrapper'])[2]"));
////✅ 17. Elements inside specific UL
//        driver.findElements(By.xpath("(//ul[@class='wrapper'])[1]//li"));
////✅ 18. Get last element
//        driver.findElement(By.xpath("(//li)[last()]"));
////✅ 19. Get element before last
//        driver.findElement(By.xpath("(//li)[last()-1]"));
////✅ 20. Any element contains text
//        driver.findElement(By.xpath("//*[contains(text(),'Postman')]"));
////🔥 أقوى 3 Locators في الشغل الحقيقي
//
////        ركز عليهم 👇
//
//// 1
////li[@id='selenium']
//
//// 2
////li[@name='appium']
//
//// 3
////li[contains(text(),'Cypress')]
   }
}
