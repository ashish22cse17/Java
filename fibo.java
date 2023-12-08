import java.util.Scanner; 
public class fibo { 
public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	int n=sc.nextInt(); 
System.out.println(fib(n));
sc.close();
    } 
static int fib(int n) {
    int a=-1,b=1,c;
    for(int i=0;i<n;i++){
    c=a+b;
    a=b;
    b=c;
    }
    return b;
}
}