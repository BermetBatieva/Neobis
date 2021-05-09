import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            int num = sc.nextInt();
            int sum = 0;
            for (int j = 1; j<=num; j++){
                if (num%j==0){
                    sum++;
                }
            }
            if (sum==2){
                System.out.println(num+" eh primo");
            }
            else {
                System.out.println(num+" nao eh primo");
            }
        }
    }
}