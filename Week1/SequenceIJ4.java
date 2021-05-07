import java.util.*;
public class SequenceIJ4 {
    public static void main(String[] args) {
        float i, j, value;
        int temp, temp2;
        for (i = 0, j = 1, value = 0, temp = 0, temp2 = 0; i < 2.2; j++){
            if(temp2 == 0){
                System.out.printf("I=%.0f J=%.0f%n", i, j);
            }else{
                System.out.printf("I=%.1f J=%.1f\n", i, j);
            }
            temp++;
            if(temp == 3){
                i += 0.2;
                value += 0.2;
                j = value;
                temp = 0;
                temp2++;
            }
            if(temp2 == 5)
                temp2 = 0;
        }
    }
}