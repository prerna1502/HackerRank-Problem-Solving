import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long sum = 0;
            while (N-- > 0 ) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}