 import java.util.*;
 public class factorial {
        public static void main(String[] args) {
           try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter value of n:-");
            Long n=sc.nextLong();
            int factorial = 1;
            for (int i = 1; i <= n; i++)
                factorial *= i;
            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }
}