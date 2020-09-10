import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number: ");
        int num = sc.nextInt();

        boolean check = true;
        if (num < 2) {
            //System.out.println(num + " is prime number");
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }else {
                    check = true;
                }
            }
        }
        if (check){
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " is not a prime number");
        }
    }
}
