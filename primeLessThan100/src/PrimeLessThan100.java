import java.util.Scanner;
public class PrimeLessThan100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int n = 2; n < 100; n++){
            boolean check = true;

            for (int i = 2; i<= Math.sqrt(n); i++){
                if (n%i ==0){
                    check = false;
                    break;
                }else {
                    check = true;
                }
            }

            if (check){
                System.out.println(n+" ");
            }
        }

    }
}
