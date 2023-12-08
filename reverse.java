import java.util.*;
public class reverse {
    public static void main(String args[]){
        int r=0;
        System.out.println("enter number to reverse");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        while(m>0){
            int d=m%10;
            r=r*10+d;
            m=m/10;
        }
        System.out.printf("reverse of %d is %d",n,r);
        sc.close();
    }  
}
