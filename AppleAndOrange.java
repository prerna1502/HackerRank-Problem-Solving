import java.util.*;
public class AppleAndOrange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int am[] = new int[m];
        int bn[] = new int[n];
        int countapples=0,countoranges=0;
        for(int i=0;i<m;i++)
        {
            am[i]=sc.nextInt();
            if(a + am[i] >=s && a+am[i]<=t)
            countapples++;
        }
        for(int j=0;j<n;j++)
        {
            bn[j]=sc.nextInt();
            if(b + bn[j] >=s && b+bn[j]<=t)
            countoranges++;           
        }
        System.out.println(countapples);
        System.out.println(countoranges);
    }
}
