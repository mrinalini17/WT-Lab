import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        String concatString = firstString.concat(secondString);
        int len = concatString.length();
        int subLength = len / 4;
        String sub1 = concatString.substring(0, subLength);
        String sub2 = concatString.substring(subLength, 2 * subLength);
        String sub3 = concatString.substring(2 * subLength, 3 * subLength);
        String sub4 = concatString.substring(3 * subLength, len);
        System.out.println("Concatenated string: " + concatString);
        System.out.println("Substring 1: " + sub1);
        System.out.println("Substring 2: " + sub2);
        System.out.println("Substring 3: " + sub3);
        System.out.println("Substring 4: " + sub4);
    }
}