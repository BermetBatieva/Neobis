import java.util.*;
public class GameTimewithMinutes{
    public static void main(String[] args) {
        int h1, h2, m1, m2;
        int d;

        Scanner sc = new Scanner(System.in);

        h1 = sc.nextInt();
        m1 = sc.nextInt();
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        d=(h2 * 60 + m2)-(h1 * 60 + m1);

        if(d > 0){
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", d / 60, d % 60);
        }
        else if(d < 0){
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n",(24*60 + d)/60, (24*60 + d) % 60);
        }
        else if(d == 0){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");

        }




    }

}
