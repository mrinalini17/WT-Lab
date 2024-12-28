/*Write a Java class which has a method called ProcessInput(). This method checks the number
entered by the user. If the entered number is negative then throw an user defined exception called
NegativeNumberException, otherwise it displays the double value of the entered number.*/
import java.util.*;

class NegativeNumberException extends Exception {
    NegativeNumberException(String num){
        super(num);
    }
}

public class Q4 {
    static void ProcessInput(int number) throws NegativeNumberException {
        if (number<0){
            throw new NegativeNumberException("Number is negative.");
        } else
        System.out.println("Number is positive.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        try {
            ProcessInput(number);
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }
        sc.close();
    }
}