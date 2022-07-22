import java.util.Scanner;

public class MarkAverage {
    public static void main(String[] args) {
        System.out.println("Merhabalar hos geldiniz ");
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Matematik Notunuzu Giriniz :");
        int mat= input.nextInt();

        System.out.print("Lutfen Fizik Notunuzu Giriniz :");
        int fizik= input.nextInt();

        System.out.print("Lutfen  Turkce Notunuzu  Giriniz :");
        int turkce= input.nextInt();

        System.out.print("Lutfen Kimya Notunuzu Giriniz :");
        int kimya= input.nextInt();

        System.out.print("Lutfen Tarih Notunuzu Giriniz :");
        int tarih= input.nextInt();

        System.out.print("Lutfen Muzik Notunuzu Giriniz :");
        int muzik= input.nextInt();

        int toplam = mat + turkce + fizik+ tarih+kimya+muzik;
        double ortalama= toplam/6.0;
        System.out.println( "Ortalamaniz : " +ortalama + " "+ (ortalama>60 ? "Sinifi Gecti ":"Sinifta Kaldi "));
    }
}
