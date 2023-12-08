import java.util.Scanner;

public class swap {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter numbers to swap");
int a=sc.nextInt();
int b=sc.nextInt();
int t=a;
a=b;
b=t;
System.out.printf("a=%d and b=%d",a,b);
sc.close();
    }
}
