import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private static int nextIndexNumber = 1;
    private String indexNumber;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
    private String address;
    private List<Grade> grades;
    private Studies studies;
    private int currentSemester;

    public Student(String firstName, String lastName, String email, String address, Date birthDate) {
        this.indexNumber = "s" + nextIndexNumber++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.grades = new ArrayList<>();
        this.currentSemester = 1;
    }

    public void enrollStudent(Studies studies) {
        this.studies = studies;
    }

    public void addGrade(int value, String subjectName) {
        Grade grade = new Grade(value, subjectName);
        grades.add(grade);
    }

    public void promoteToNextSemester() {
        if (currentSemester < studies.getNumberOfSemesters()) {
            currentSemester++;
        } else {
        }
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }
}
