import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numbers of prime number");
        int nums = sc.nextInt();
        int count = 0;
        int n = 2;

        while (count != nums) {
            if (nums == 1) {
                System.out.println(n);
                break;
            }

            boolean check = true;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check) {
                System.out.println(n + " ");
                count++;
            }
            n++;
        }

//        for (int i =0; i<nums; i++){
//            if (i > 2) {
//                boolean check = true;
//                for (int j = 2; ; j++){
//                    if (i % j == 0){
//                        check = false;
//                        break;
//                    }else {
//                        check = true;
//                    }
//                    if (check){
//                        count++;
//                    }
//                }
//            } else {
//                count = 0;
//            }
//        }
    }
}
