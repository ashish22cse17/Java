/*check whether entered number is armstrong */
import java.util.*;
public class armstrong {
    public static void main(String args[]){
        int s=0,c=0;
        Scanner dc=new Scanner(System.in);
        System.out.println("enter number to  check");
        int n=dc.nextInt();
        int m=n;
        int p=n;
        while(p>0){
                c=c+1;
                p=p/10;
        }
        while(m>0){
            int d=m%10;
            s=s+(int)Math.pow(d,c);
            m=m/10;
        }
        if(n==s)
        System.out.println("armstrong");
        else
        System.out.println("not armstrong");
        dc.close();
    }
    
}
