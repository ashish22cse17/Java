import java.util.Scanner;
public class replacestring {
    public static void main(String args[]){
        System.out.println("enter your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        name=name.replace('a','k');
        System.out.println(name);
        sc.close();
    }  
}