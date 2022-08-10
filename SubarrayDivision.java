import java.util.*;
public class SubarrayDivision{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;
        
        for(int i = 0; i < n-m+1; i++){
            int tmpSum = 0;
            for(int j = i; j < i+m; j++){
                tmpSum+= squares[j];
            } 
            if(tmpSum == d){
                result++;
            }
        }
        System.out.println(result);
        
    }
}