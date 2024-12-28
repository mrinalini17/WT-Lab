import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();
        String upper = first.toUpperCase();
        String lower = first.toLowerCase();
        String reverse = new StringBuilder(second).reverse().toString();
        boolean Equal = first.equals(second);
        System.out.print("Enter the index where you want to insert the second string in the first string: ");
        int index = scanner.nextInt();
        String insert = first.substring(0, index) + second + first.substring(index);
        System.out.println("Uppercase string: " + upper);
        System.out.println("Lowercase string: " + lower);
        System.out.println("Reversed string: " + reverse);
        System.out.println("Are the two strings equal? " + Equal);
        System.out.println("String with second string inserted: " + insert);
    }
}
