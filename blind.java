import java.util.Scanner;
public class blind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1&&n<1){
            System.out.println("Number is not prime");
            }
            else{
            if(n%1==0&&n%n==0){
            System.out.println("number is prime");
            }
            else{
            System.out.println("number is not prime");
            }
        }
    }
}
