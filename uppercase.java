import java.util.Scanner;
public class uppercase {
    public static void main(String args[]){
        System.out.println("enter name to convert");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        name=name.toUpperCase();
        System.out.println(name);
        sc.close();
    }
}
