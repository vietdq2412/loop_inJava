import java.util.Scanner;

public class ShapeMenu {
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
                    System.out.println("input size of the triangle: ");
                    int size = sc.nextInt();


                    System.out.println("Menu square angle:\n" +
                            "1.top-left\n" +
                            "2.top-right\n" +
                            "3.botton-left\n" +
                            "4.botton-right\n" +
                            "5.exit\n" +
                            "Enter your choice:");
                    int choice1 = sc.nextInt();
                    while (choice1 != 5) {
                        switch (choice1) {
                            case 1:
                                for (int i = 5; i > 0; i--) {
                                    System.out.println("");
                                    for (int j = 0; j < 5; j++) {
                                        if (j < i) {
                                            System.out.print(" * ");
                                        }
                                    }
                                }
                                break;
                            case 2:
                                for (int i = 0; i < 5; i++) {
                                    System.out.println("");
                                    for (int j = 0; j < 5; j++) {
                                        if (j >= i) {
                                            System.out.print(" * ");
                                        }else {
                                            System.out.print("   ");
                                        }
                                    }
                                }
                                break;
                            case 3:
                                for (int i = 1; i <= 5; i++) {
                                    System.out.println("");
                                    for (int j = 0; j < 5; j++) {
                                        if (j < i) {
                                            System.out.print(" * ");
                                        }
                                    }
                                }
                                break;
                            case 4:
                                for (int i = 5; i > 0; i--) {
                                    System.out.println("");
                                    for (int j = 1; j <= 5; j++) {
                                        if (j < i) {
                                            System.out.print("   ");
                                        }else {
                                            System.out.print(" * ");
                                        }
                                    }
                                }
                                break;
                            default:
                        }
                        System.out.println("\n\nMenu square angle:\n" +
                                "1.top-left\n" +
                                "2.top-right\n" +
                                "3.botton-left\n" +
                                "4.botton-right\n" +
                                "5.exit\n" +
                                "Enter your choice:");
                        choice1 = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("input side of the square: ");
                    int side = sc.nextInt();
                    for (int j = 0; j < side; j++) {
                        System.out.println("");
                        for (int i = 0; i < side; i++) {
                            System.out.print(" * ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Draw the retangale");
                    System.out.println("input width: ");
                    int width = sc.nextInt();
                    System.out.println("input length: ");
                    int length = sc.nextInt();
                    for (int i = 0; i < width; i++) {
                        System.out.println("");
                        for (int j = 0; j < length; j++) {
                            System.out.print(" * ");
                        }
                    }
                    break;
                default:
            }
            System.out.println("\n\nMenu\n" +
                    "1.Draw the triangle\n" +
                    "2.Draw the square\n" +
                    "3.Draw the rectangle\n" +
                    "4.Exit\n" +
                    "Enter your choice:");
            choice = sc.nextInt();
        }
    }
}
