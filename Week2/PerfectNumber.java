import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        int number, sum;
        for (int i = 0; i < test; i++) {
            sum = 0;
            number = scan.nextInt();
            for (int j = 1; j < number; j++) {
                if (number % j == 0){
                    sum += j;
                }
            }

            if (sum == number) {
                System.out.println(number + " eh perfeito");
            }
            else
                System.out.println(number + " nao eh perfeito");
        }
    }

}