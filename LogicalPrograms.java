import java.util.Scanner;

public class LogicalPrograms {
    public static void main(String[] args) {
        LogicalPrograms logic = new LogicalPrograms();
        logic.fibonacci();
        logic.perfectNumber();
        logic.primeNumber();
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
    public void perfectNumber() {
        Scanner sc = new Scanner(System.in);
        // get input from user
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            while (num % i == 0) {
                System.out.println(i);
                sum = sum + i;
                break;
            }
        }
        // check sum of its divisor equal to the input number
        if (num == sum) {
            System.out.println(num + " is a Perfect Number");
        } else
            System.out.println(num + " is Not a Perfect Number");
    }
    public void primeNumber() {
        // Get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        // find prime factors of given number using for loop
        if (number > 2) {
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    System.out.println(i);
                    number = number / i;
                }
            }
        } else if (number == 0 || number == 1) {
            System.out.println(" 0 and 1 are not counted as prime number");
        } else if (number == 2) {
            System.out.println("All even number can be divide by 2");
            System.out.println("So 2 is only even prime number");
        }
    }
}


