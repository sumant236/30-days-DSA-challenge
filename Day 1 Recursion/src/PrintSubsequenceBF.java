import java.util.Scanner;

import static java.lang.System.in;

public class PrintSubsequenceBF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String str = sc.nextLine();

        String[] arr = str.split("");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
}
