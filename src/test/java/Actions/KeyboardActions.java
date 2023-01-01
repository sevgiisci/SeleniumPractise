package Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class KeyboardActions extends TestBase {
    @Test
    public void keyboardTest() {

        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        //2- Hover over Me First" kutusunun ustune gelin
        Actions actions = new Actions(driver);
        WebElement hoverElement = driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        actions.contextClick(hoverElement).perform();
        //3- Link 1" e tiklayin
        driver.findElement(By.xpath("//a[@class='list-alert']")).click();
        //4- Popup mesajini yazdirin
        String popupMesaji = driver.switchTo().alert().getText();
        System.out.println(popupMesaji);
        //5- Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        ReusableMethods.wait(3);
        //6- “Click and hold" kutusuna basili tutun
        driver.findElement(By.xpath("//div[@id='click-box']")).click();
        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        WebElement dontReleasEYazisiElementi = driver.findElement(By.xpath("//div[text()='Dont release me!!!']"));
        System.out.println(dontReleasEYazisiElementi.getText());
        //8- “Double click me" butonunu cift tiklayin
        WebElement doubleClickKutusu = driver.findElement(By.id("double-click"));
        actions.doubleClick(doubleClickKutusu).perform();
    }
}