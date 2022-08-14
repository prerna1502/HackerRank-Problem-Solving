import java.util.*;
public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] birds = new int[5];
        for (int i = 0; i < n; i++) birds[sc.nextInt()-1]++;
        int max = 0;
        int id = 0;
        for (int i = 0; i < 5; i++) {
            if (birds[i] > max) {
                max = birds[i];
                id = i+1;
            }
        }
        System.out.println(id);
    }
}