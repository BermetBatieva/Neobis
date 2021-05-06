import java.util.*;
public class BanknotesAndCoins{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double  money = scan.nextDouble();
        int dollars = (int)money;
        int cents = (int) ((money - dollars)*100);

        int hundrets = dollars / 100;//5
        dollars %=100; //76
        int fifty = dollars / 50;//1
        dollars %= 50;//26
        int twenty =  dollars / 20;
        dollars %= 20;
        int ten = dollars / 10;
        dollars %= 10;
        int five = dollars / 5;
        dollars %= 5;
        int two = dollars / 2;
        dollars %= 2;
        System.out.println("NOTAS:");
        System.out.println(hundrets + " nota(s) de R$ 100.00");
        System.out.println(fifty + " nota(s) de R$ 50.00");
        System.out.println(twenty + " nota(s) de R$ 20.00");
        System.out.println(ten + " nota(s) de R$ 10.00");
        System.out.println(five + " nota(s) de R$ 5.00");
        System.out.println(two + " nota(s) de R$ 2.00");


        System.out.println("MOEDAS:");
        System.out.println(dollars + " moeda(s) de R$ 1.00");

        System.out.println(cents / 50 + " moeda(s) de R$ 0.50");
        cents %= 50;
        System.out.println(cents / 25 + " moeda(s) de R$ 0.25");
        cents %= 25;
        System.out.println(cents / 10 + " moeda(s) de R$ 0.10");
        cents %= 10;
        System.out.println(cents / 5 + " moeda(s) de R$ 0.05");
        cents %= 5;
        System.out.println(cents + " moeda(s) de R$ 0.01");
    }
}