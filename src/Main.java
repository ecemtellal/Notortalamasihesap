import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int totalPoint=0,lessonCount=6 ,passPoint=60;
        Scanner input=new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        totalPoint+=input.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        totalPoint+=input.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        totalPoint+=input.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        totalPoint+=input.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        totalPoint+=input.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        totalPoint+=input.nextInt();
        int average=(totalPoint)/lessonCount;
        System.out.println("Ders Ortalamanız:" + average);
        String userInfo= average > passPoint ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(userInfo);


    }}