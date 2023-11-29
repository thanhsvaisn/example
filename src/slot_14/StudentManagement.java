package slot_14;
import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement {
    private static Student[] students;
    private static int studentCount;

    public static void main(String[] args) {
        students = new Student[100];
        studentCount = 0;

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    sortStudentByGpa();
                    break;
                case 5:
                    sortStudentByName();
                    break;
                case 6:
                    showStudent();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    private static void addStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student date of birth: ");
        String dateOfBirth = scanner.next();
        System.out.print("Enter student address: ");
        String address = scanner.next();
        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();

        Student newStudent = new Student(studentCount + 1, name, dateOfBirth, address, gpa);
        students[studentCount++] = newStudent;

        System.out.println("Student added successfully.");
    }

    private static void editStudent() {
        // Code to edit a student by id
    }

    private static void deleteStudent() {
        // Code to delete a student by id
    }

    private static void sortStudentByGpa() {
        Arrays.sort(students, 0, studentCount, (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        System.out.println("Students sorted by GPA.");
    }

    private static void sortStudentByName() {
        Arrays.sort(students, 0, studentCount, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Students sorted by name.");
    }

    private static void showStudent() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }
}

