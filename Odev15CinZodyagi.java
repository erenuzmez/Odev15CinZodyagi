package BKosulluIfadeler;
import java.util.Scanner;
public class Odev15CinZodyagi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yil;
        String burc="";
        System.out.println("Doğum yılınızı giriniz:");
        yil=input.nextInt();
        switch (yil%12){
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.Tekrar deneyiniz.");
        }
        System.out.println("Çin Zodyağı Burcunuz:"+burc);
    }
}
