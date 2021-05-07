import java.util.Scanner;
public class ColumnInArray{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double M[][] = new double[12][12];
        int C = scan.nextInt();
        scan.nextLine();
        String operation = scan.next();
        double result = 0;

        for(int row = 0; row < M.length; row++){
            for(int col = 0; col < M.length; col++){
                M[row][col] = scan.nextDouble();
                if(col == C){
                    result += M[row][C];
                }
            }
        }


        if (operation.equals("M")) {
            System.out.printf("%.1f\n", result/12);
        } else {
            System.out.printf("%.1f\n", result);
        }
    }
}