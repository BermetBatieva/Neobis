import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();

        for(int i=0; i<N;i++){
            int b =0;
            int X=sc.nextInt();
            for(int j=1; j<=X/2;j++){
                if((X%j)==0){
                    b+=j;
                }
            }
            if (b==X){
                System.out.printf("%d eh perfeito\n",X);
            }
            else{
                System.out.printf("%d nao eh perfeito\n",X);
            }



        }
    }
}