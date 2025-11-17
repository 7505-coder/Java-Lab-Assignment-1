import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("===== Student Record Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Student s = new Student();
                    s.inputDetails();
                    list.add(s);
                    break;

                case 2:
                    for (Student stu : list) {
                        stu.displayDetails();
                        System.out.println("--------------------");
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
