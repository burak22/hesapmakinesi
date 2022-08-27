import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,select;

        System.out.print("ilk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("\nSeçiniz: \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("İşleminiz Sonucu: " + (n1+n2));
                break;
            case 2:
                System.out.println("İşleminiz Sonucu: " + (n1-n2));
                break;
            case 3:
                System.out.println("İşleminiz Sonucu: " + (n1*n2));
                break;
            case 4:
                System.out.println("İşleminiz Sonucu: " + (n1/n2));
                break;
            default:
                System.out.println("Seçtiğiniz işlem geçersiz.");
        }
    }


}