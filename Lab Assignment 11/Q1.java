import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");
        String newFullName = nameParts[0] + " Kumar " + nameParts[1];
        System.out.println("Modified full name: " + newFullName);
        scanner.close();
    }
}
