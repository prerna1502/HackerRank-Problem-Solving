import java.util.*;
public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            boolean flag = true;
            for (int j = 0; j < n && flag; j++) {
                if (i % A[j] != 0) 
                flag = false;
            }
            for (int j = 0; j < m && flag; j++) {
                if (B[j] % i != 0) 
                flag = false;
            }
            if (flag) 
            count++;
        }
        System.out.println(count);
    }
}