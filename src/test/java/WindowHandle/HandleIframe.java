package WindowHandle;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class HandleIframe extends TestBase {
    @Test
    public void iframeTest(){
        // 1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        // 2) sayfadaki iframe sayısını bulunuz.
        WebElement iframeElementi= driver.findElement(By.xpath("//*[@name='googlefcPresent']"));
        driver.switchTo().frame(iframeElementi);


        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.

        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        // 5) ikinci iframe'deki (Jmeter Made Easy) linke
        //(https://www.guru99.com/live-selenium-project.html) tıklayınız

    }


}
