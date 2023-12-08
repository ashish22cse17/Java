import java.util.*;
public class pallindrome {
    public static void main(String args[]){
        int r=0;
        System.out.println("enter number to check");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        while(m>0){
            int d=m%10;
            r=r*10+d;
            m=m/10;
        }
        if(n==r)
        System.out.println("pallindrome");
        else
        System.out.println("not pallindrome");
        sc.close();
    }
    
}
