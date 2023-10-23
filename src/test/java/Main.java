import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        String platform = JOptionPane.showInputDialog("Android Tarafı İçin 1, IOS Tarafı İçin 2 Giriniz");

        switch (platform) {
            case "1":
                Android.playStore();
                break;
            case "2":
                iOS.appStore();
                break;
            default:
                JOptionPane.showMessageDialog(null, "GECERSİZ BİR DEGER GİRDİNİZ");
        }
    }
}
