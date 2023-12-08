import java.util.*;
public class digitsum {
    public static void main(String args[]){
        int s=0;
        System.out.println("enter number n:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        while(m>0){
            int d=m%10;
            s=s+d;
            m=m/10;
        }
        System.out.println(s);
        sc.close();
    }
}
