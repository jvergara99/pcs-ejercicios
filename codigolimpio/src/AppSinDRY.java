import java.util.Scanner;

public class AppSinDRY {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa valor de x: ");
        int x = in.nextInt();
        System.out.println("Ingresa valor de y:");
        int y = in.nextInt();

        int ans1 = 1;
        for (int i = 1; i <= 3; i++) {
            ans1 = ans1 * x; 
        }
        System.out.println(" x a la 2 = " + ans1);

        int ans2 = 1;
        for (int i = 1; i <= 5; i++) {
            ans2 = ans2 * y; 
        }
        System.out.println(" y a la 5 = " + ans2);

    }
}
