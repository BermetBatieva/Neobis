import java.util.Scanner;
public class CaesarCipher{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        String s = scan.nextLine();
        int a = 0;
        for (int j = 0;j < test; j++)
        {
            s = scan.nextLine();
            if (a != 0)
                s = scan.nextLine();
            int n = scan.nextInt();
            char[] b  = new char[s.length()];

            for (int i = 0; i < s.length(); i++) {

                int c = ((int)s.charAt(i)-n);

                if(c<65) {
                    c = c+26;
                }
                b [ i ] = (char) c;
                System.out.print( b [ i ] );
            }
            System.out.print("\n");
            a++;
        }
    }
}