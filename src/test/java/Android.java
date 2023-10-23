import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class Android {
    public static void playStore() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://play.google.com/store/apps/details?id=com.whatsapp&hl=tr&gl=US");

        String oldVersion;
        String newVersion;

        oldVersion = driver.findElement(By.className("xg1aie")).getText();

        while (true) {
            Thread.sleep(10000);
            newVersion = driver.findElement(By.className("xg1aie")).getText();
            System.out.println("Son Güncelleme Tarihi : " + oldVersion);

            if (oldVersion.contains(newVersion)) {
                driver.navigate().refresh();
            } else {
                Alarm.Play();
                System.out.println("Son Güncelleme Tarihi : " + newVersion);
                JOptionPane.showMessageDialog(null, "SÜRÜM GÜNCELLENDİ");
                break;
            }
        }
    }
}
