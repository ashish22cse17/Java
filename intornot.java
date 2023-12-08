import java.util.Scanner;
public class intornot {
    public static void main(String args[]){
        System.out.println("enter the value of n:-");
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(n>=0&&n<0)
        System.out.println("integer");
        else
        System.out.println("not a integer");
        sc.close();
    }   
}
