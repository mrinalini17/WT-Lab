public class Q4 {
    public static void main(String[] args) {
    String student1 = "Mayank Ranjan Padhi";
    String student2 = "Ahmed Asmit Patel";
    String[] nameParts1 = student1.split(" ");
    String lastName1 = nameParts1[nameParts1.length - 1];
    String[] nameParts2 = student2.split(" ");
    String lastName2 = nameParts2[nameParts2.length - 1];
    String newStudent1 = "";
    String newStudent2 = "";
    for (int i = 0; i < nameParts1.length - 1; i++) {
    newStudent1 += nameParts1[i] + " ";
    }
    newStudent1 += lastName2;
    for (int i = 0; i < nameParts2.length - 1; i++) {
    newStudent2 += nameParts2[i] + " ";
    }
    newStudent2 += lastName1;
    System.out.println("New student 1 name: " + newStudent1);
    System.out.println("New student 2 name: " + newStudent2);
    }
}