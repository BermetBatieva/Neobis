import java.util.Scanner;
import static java.lang.Math.pow;
public class TriangleTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double  a = scan.nextDouble();
        double  b = scan.nextDouble();
        double  c = scan.nextDouble();

        if(a < b)
            a = returnFirst(b, b = a);
        if(a < c)
            a = returnFirst(c, c = a);
        if(b < c)
            b = returnFirst(c, c = b);

        if (a >= b + c)
            System.out.println("NAO FORMA TRIANGULO");
        else {
            if (pow(a, 2) == pow(b, 2) + pow(c, 2))
                System.out.println("TRIANGULO RETANGULO");
            if (pow(a, 2) > pow(b, 2) + pow(c, 2))
                System.out.println("TRIANGULO OBTUSANGULO");
            if (pow(a, 2) < pow(b, 2) + pow(c, 2))
                System.out.println("TRIANGULO ACUTANGULO");
            if (a == b && b == c)
                System.out.println("TRIANGULO EQUILATERO");
            if ((a == b && c != a) || (a == c && b != a) || (c == b && c != a))
                System.out.println("TRIANGULO ISOSCELES");
        }
    }

    private static double returnFirst(double num1, double num2){
        return num1;
    }
}