import java.util.*;

public class BirthdayCakeCandles{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int max = 0;
        int count = 0;
        int h;
        for(int i =0; i < n; i++){
            h = sc.nextInt();
            if(h > max){
                count = 1;
                max = h;
            }else if(h == max){
                count++;
            }
        }
        System.out.println(count);
}
}