import java.util.Scanner;

public class switch1 {
    public static void main(String args[]){
        System.out.println("enter option you have choosed");
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch(button){
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("namaste");
            break;
            case 3:System.out.println("bonjour");
            break;
            default: System.out.println("invalid input");
        }
        sc.close();
    }
}
