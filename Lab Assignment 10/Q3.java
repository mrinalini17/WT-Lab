//Write a Java program to illustrate try..catch..finally block.
public class Q3 {
    public static void main(String[] args) {
        try{
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
