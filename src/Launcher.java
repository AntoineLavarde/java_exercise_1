import java.util.Scanner;

public class Launcher {
    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1 || number == 2) {
            return 1;
        } else {
            return fibonacci(number - 2) + fibonacci(number - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, Welcome Here !");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write whatever you want : ");
            String result = scanner.nextLine();
            if ("fibo".equals(result)) {
              System.out.println("Enter a number n to get the Fibonacci sequence at the index number n : ");
              int input = scanner.nextInt();
              System.out.print("F(" + input + ")" + " = " + fibonacci(input) + "\n");
              scanner.nextLine();
            } else if (!"quit".equals(result)) {
                System.out.println("Unknow command");
            } else {
                break;
            }
        }
    }
}