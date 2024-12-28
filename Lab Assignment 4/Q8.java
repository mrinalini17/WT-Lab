import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your first and last name:");
        String first=sc.nextLine();
        String last=sc.nextLine();
        System.out.println("Your last name followed by first name is: "+last+" "+first);
        sc.close();
    }
}
