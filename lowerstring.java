import java.util.Scanner;
public class lowerstring {
    public static void main(String args[]){
        System.out.println("enter string to convert");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        name=name.toLowerCase();
        System.out.println(name);
        sc.close();
    }
    
}
