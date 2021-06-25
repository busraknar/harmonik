import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        //1+1/2+1/n;
        Scanner input= new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        double sayi= input.nextInt();
        double top=0;
        double sonSayi=sayi;
        System.out.println("Harmonik seri formülü:");
            for(double i=1; i<=sayi; i++) {
                top += (1 / i);
                System.out.print("1/" + i);
                if(i!=sayi)
                System.out.print("+");
            }
        System.out.println("\n"+sonSayi+" sayısının harmonik değeri:"+ top);
    }
}
