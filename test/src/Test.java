import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("a: "+a);
        System.out.println("name: "+ name);
    }
}
