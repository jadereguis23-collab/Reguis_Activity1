
public class Student {

    private String name;
    private String studentId;
    private double grade;

    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name +
            " | ID: " + studentId +
            " | Grade: " + grade);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Alex Rivera", "2026-101", 85.0);
        Student student2 = new Student("Sophia Garcia", "2026-102", 90.5);

        student1.setGrade(95.0);

        student1.displayInfo();
        student2.displayInfo();
    }
}
