/*swaping without third variable */
import java.util.Scanner;
public class swap2 {
    public static void main(String args[]){
        System.out.println("enter two number to swap");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
