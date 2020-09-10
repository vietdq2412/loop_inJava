import java.util.Scanner;
public class InteresCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input amount: ");
        double amount = sc.nextDouble();
        System.out.println("input rate per year (%): ");
        double rate = sc.nextDouble();
        System.out.println("input number of months: ");
        int time = sc.nextInt();

        double interest = 0;
        for (int i = 0; i<time; i++){
            amount += amount * (rate/100)/12;
        }

        System.out.println("final amount: "+ amount);
    }
}
