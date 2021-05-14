import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int upperСase = 0,lowerСase = 0,isDigit = 0;
        int check;

        while (scan.hasNext()) {
            String password = scan.nextLine();
            if (password.contains(" ") || password.length() > 32 || password.length() < 6) {
                System.out.println("Senha invalida.");
            }
            else {
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isUpperCase(password.charAt(i))) {
                        upperСase++;
                    }
                    if (Character.isLowerCase(password.charAt(i))) {
                        lowerСase++;
                    }
                    if (Character.isDigit(password.charAt(i))) {
                        isDigit++;
                    }
                }
                check = lowerСase + upperСase + isDigit;
                if (upperСase == 0 || lowerСase == 0 || isDigit == 0 || check != password.length()) {
                    System.out.println("Senha invalida.");
                }
                else {
                    System.out.println("Senha valida.");
                }
                lowerСase = 0;
                upperСase = 0;
                isDigit = 0;
            }
        }

    }
}
