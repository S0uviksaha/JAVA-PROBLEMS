package Pattern;
import java.util.Scanner;
public class halfPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no of rows: ");
      int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
