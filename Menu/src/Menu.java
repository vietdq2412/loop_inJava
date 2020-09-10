import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu\n" +
                "1.Draw the triangle\n" +
                "2.Draw the square\n" +
                "3.Draw the rectangle\n" +
                "4.Exit\n" +
                "Enter your choice:");

        int choice = sc.nextInt();
        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (int i = 0; i < 6; i++) {
                        System.out.println("* * * * * *");
                    }
                    break;
                case 3:
                    System.out.println("Draw the retangale");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("* * * * * *");
                    }
                    break;
                default:
            }
            System.out.println("enter your choice: ");
            choice = sc.nextInt();
        }
    }
}
