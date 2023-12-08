import java.util.Scanner;
public class assigmnent12{
public static void main( String args[]) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
//Called the method sum() to find the sum of two numbers.
// System.out.println(QuestionScope.sum(n1,n2));
QuestionScope fdf=new QuestionScope();
System.out.println(fdf.sum(n1, n2));
//Called the method multiply() to find the product of two numbers.
System.out.println(QuestionScope.multiply(n1,n2));
sc.close();
}
}
class QuestionScope {
 int sum(int a, int b){ //non-static method
        return a + b;
    }
static int multiply(int a, int b){ //static method
        return a * b;
    }
}
