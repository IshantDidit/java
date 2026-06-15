package Week5.StudentManagementSystem;

public class Student {
    private String name;
    private int rollnumber;
    private int marks;

    public Student(String name, int rollnumber) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks, String faculty) {
        if(faculty.equalsIgnoreCase("teacher")){
            if (marks<0 || marks>=100){
                System.out.println("wrong");
            }else {
                this.marks=marks;
            }

        }
    }
}
