import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input a: ");
        int a = sc.nextInt();
        System.out.println("input b: ");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common divisor");
        }

        while (a != b){
            if(a > b){
                a = a -b;
            }else if (a < b){
                b = b -a;
            }
        }

        System.out.println("bigest common divisor: " + a);
    }
}
