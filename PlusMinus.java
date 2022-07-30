import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int a[] = new int[arr.size()];
    for(int i=0;i<arr.size();i++){
        a[i]=arr.get(i);
    }
    int p=0,n=0,z=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>0)
        p++;
        else if(a[i]<0)
        n++;
        else
        z++;
    }
     System.out.println(((double)p/(double)a.length));
    System.out.println((double)n/(double)a.length);
    System.out.println((double)z/(double)a.length);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        PlusMinus.plusMinus(arr);

        bufferedReader.close();
    }
}

}
