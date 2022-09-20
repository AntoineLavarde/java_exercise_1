import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome Here !");
        System.out.println("Write whatever you want : ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String result = scanner.nextLine();
            if (!result.equals("quit")) {
                System.out.println("Unknow command");
            } else {
                break;
            }
        }
    }
}