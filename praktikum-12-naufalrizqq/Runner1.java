import java.util.Scanner;

public class Runner1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int q = 1; q < 2*i; q++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //Segitiga terbalik
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int q = 1; q <= (n*2-1)-(2*i) ; q++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
