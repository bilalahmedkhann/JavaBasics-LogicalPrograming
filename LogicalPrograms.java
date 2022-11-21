import java.util.Scanner;

public class LogicalPrograms {
    public static void main(String[] args) {
        LogicalPrograms logic = new LogicalPrograms();
        logic.fibonacci();
    }
    public void fibonacci() {
        // Initialization Fibonacci Series {0,1,1,2,3,5,8...n}
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number upto fibonacci series :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        // Print  fibonacci number using for loop
        for (int i = 0; i <= n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}


