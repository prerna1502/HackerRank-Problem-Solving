import java.util.*;
class MinMaxSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long arr[]=new long[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int smallest = 0;
        for(int i=0;i<4;i++)
        {
            smallest+=arr[i];
        }
        int largest=0;
        for(int i=1;i<5;i++)
        {
            largest+=arr[i];
        }
        System.out.println(smallest+" "+largest); 
    }
}
