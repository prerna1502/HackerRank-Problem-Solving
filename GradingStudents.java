import java.util.*;
public class GradingStudents {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            for(int a0 = 0; a0 < n; a0++){
                int grade = in.nextInt();
                if (grade >= 38) {
                    if (grade%5 >= 3) 
                    grade = grade/5*5 + 5;
                }
                System.out.println(grade);
            }
        }
    }
}