import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Student s = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", new Date(1980, 1, 1));
        Studies it = new Studies("IT", "AAA", 7, 5);
        s.enrollStudent(it);
        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");
        Students.addStudent(s);

        Students.promoteAllStudents();

        Students.displayInfoAboutAllStudents();
    }
}
