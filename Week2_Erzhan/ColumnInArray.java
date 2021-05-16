import java.util.Scanner;

public class ColumnInArray {
    public static  void main(String args[]){
        float sum = 0;
        float avg = 0;
        Scanner sc = new Scanner(System.in);
        float M[][] = new float[12][12];
        int n = sc.nextInt();
        String option = sc.next();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextFloat();
            }
        }


        for (int i = 0; i < 12; i++) {
            sum +=  M[i][n];
        }
        avg = sum / 12;
        if(option.equals("S")){
            System.out.printf("%.1f\n", sum);
        }else if(option.equals("M")){
            System.out.printf("%.1f\n", avg);
        }

    }

}
