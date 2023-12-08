import java.util.Scanner;
public class sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numer");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c); 
        sc.close();
    }
}
