import java.util.ArrayList;
import java.util.List;

public class Students {
    private static List<Student> allStudents = new ArrayList<>();

    public static void promoteAllStudents() {
        for (Student student : allStudents) {
            student.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : allStudents) {
            System.out.println("Index Number: " + student.getIndexNumber());
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Birth Date: " + student.getBirthDate());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Address: " + student.getAddress());
            System.out.println("Current Semester: " + student.getCurrentSemester());
            System.out.println();
        }
    }

    public static void addStudent(Student student) {
        allStudents.add(student);
    }
}
