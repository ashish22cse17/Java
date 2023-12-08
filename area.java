import java.util.Scanner;
public class area {
    public static void main(String args[]){
        System.out.println("enter radius");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double area=Math.PI*r*r;
        System.out.println(area);
        sc.close();
    }
}