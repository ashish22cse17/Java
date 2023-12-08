import java.util.*;
public class linear {
    public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
        int d=0;
        int n=sc.nextInt();
        int[] arr=new int[10];
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("enter number to search");
        int s=sc.nextInt();
         for(int i=0;i<n;i++){
            if(s==arr[i])
            d++;
         }
         if(d==0)
         System.out.println("No match found");
         else
         System.out.println("Match found");
    }
    }
}
