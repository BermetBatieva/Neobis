import java.util.Scanner;
public class Banknotes {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        System.out.println(money);
        int hundreds= money / 100;
        money %= 100;
        int f= money / 50;
        money %= 50;
        int t= money / 20;
        money %= 20;
        int t10 = money / 10;
        money %= 10;
        int t5 = money / 5;
        money %= 5;
        int t2 = money / 2;
        money %= 2;
        System.out.println(hundreds + " nota(s) de R$ 100,00");
        System.out.println(f + " nota(s) de R$ 50,00");
        System.out.println(t + " nota(s) de R$ 20,00");
        System.out.println(t10 + " nota(s) de R$ 10,00");
        System.out.println(t5 + " nota(s) de R$ 5,00");
        System.out.println(t2 + " nota(s) de R$ 2,00");
        System.out.println(money + " nota(s) de R$ 1,00");
    }
}