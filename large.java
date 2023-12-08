import java.util.*;
public class large {
    public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c)
        System.out.println(a+" is large");
        else if(b>a&&b>c)
        System.out.println(b+" is large");
        else
        System.out.println(c+" is large");
    }
    }
}

