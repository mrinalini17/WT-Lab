
import java.util.Scanner;
public class Q5 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the university seat number (USN): ");
    String usn = scanner.nextLine();
    boolean isValid = true;
    if (usn.length() != 10) {
        isValid = false;
    }
    if (!(usn.charAt(0) == '1' || usn.charAt(0) == '2')) {
        isValid = false;
    }
    String substr = usn.substring(5, 7);
    if (!(substr.equals("CS") || substr.equals("IS") || substr.equals("EC") || substr.equals("ME"))) {
        isValid = false;
        }
        String lastThreeChars = usn.substring(7);
        for (int i = 0; i < lastThreeChars.length(); i++) {
            if (!Character.isDigit(lastThreeChars.charAt(i))) {
                isValid = false;
            }
        }
        if (isValid) {
            System.out.println("Success");
        } 
        else {
            System.out.println("Failure");
        }
        scanner.close();
    }
}
