import java.util.Scanner;

public class ProvaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");

        String username = scanner.nextLine();
        System.out.println("Username is: " + username);

        scanner.close();
    }
}
