import java.util.Scanner;

public class PasswordValidator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String pass=sc.nextLine();
        System.out.println(valPassword(pass));


    }
    public static String valPassword(String password) {
        boolean hasNum = false;
        boolean hasCap = false;
        boolean hasLow = false;
        char c;

        if (password.length() < 6 || password.length() > 32 || password.contains(" ")) {
            return "Senha invalida.";
        } else {
            for (int i = 0; i < password.length(); i++) {
                char с = password.charAt(i);
                if (Character.isDigit(с)) {
                    hasNum = true;
                } else if (Character.isUpperCase(с)) {
                    hasCap = true;
                } else if (Character.isLowerCase(с)) {
                    hasLow = true;
                }
                if (hasNum && hasLow && hasCap) {
                    return "Senha valida.";
                }
            }


        }


        return "Senha invalida.";
    }}
