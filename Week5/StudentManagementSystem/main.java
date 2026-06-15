package Week5.StudentManagementSystem;

public class main {
    static void main(String[] args) {
        Student student = new Student("HaJEEJri", 12);
        student.setMarks(99, "teacher");
        System.out.println("name"+student.getName());
        System.out.println("roll"+student.getRollnumber());
        System.out.println("marks"+student.getMarks());

    }
}
