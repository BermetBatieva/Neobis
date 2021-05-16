import java.util.Scanner;

public class CaesarCipher {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        char [] ch= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int n = scan.nextInt();
        for(int i = 0;i < n; i++){
            String d = scan.next();
            int y = scan.nextInt();
            for(int j = 0;j<d.length();j++){
                for(int e= 0;e < ch.length;e++) {
                    if(d.charAt(j) == ch[e]) {
                        int p=e-y;
                        if(p >= 0)
                            System.out.print(ch[e-y]);
                        else{
                            System.out.print(ch[ch.length +p]);
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}