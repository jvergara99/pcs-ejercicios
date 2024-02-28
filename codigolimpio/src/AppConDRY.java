import java.util.Scanner;

public class AppConDRY {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa valor de x: ");
        int x = in.nextInt();
        System.out.println("x a la 3 = " + calcPow(x, 3));

        System.out.println("Ingresa valor de y:");
        int y = in.nextInt();
        System.out.println("y a la 5 = " + calcPow(y, 5));
    }

    static public int calcPow( int base, int pow) {
        int ans = 1;
        for (int i = 1; i <= pow ; i++) {
            ans *= base;
        }
        return ans;
    }

}
