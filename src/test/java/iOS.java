import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class iOS {
    public static void appStore() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://apps.apple.com/tr/app/whatsapp-messenger/id310633997?l=tr");

        String oldVersion;
        String newVersion;

        oldVersion = driver.findElement(By.xpath("//p[@class='l-column small-6 medium-12 whats-new__latest__version']")).getText();

        while (true) {
            Thread.sleep(10000);
            newVersion = driver.findElement(By.xpath("//p[@class='l-column small-6 medium-12 whats-new__latest__version']")).getText();
            System.out.println("Son Versiyon : " + oldVersion);

            if (oldVersion.contains(newVersion)) {
                driver.navigate().refresh();
            } else {
                Alarm.Play();
                System.out.println("Son Versiyon : " + newVersion);
                JOptionPane.showMessageDialog(null, "SÜRÜM GÜNCELLENDİ");
                break;
            }
        }
    }
}