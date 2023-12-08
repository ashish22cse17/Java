//+work here 

import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int d=sc.nextInt();
        if(d%1==0&&d%d==0&&d%2!=0)
        System.out.println("yes it is prime");
        else
        System.out.println("it is not a prime");
        sc.close();
    }  
}
