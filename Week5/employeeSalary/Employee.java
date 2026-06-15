package Week5.employeeSalary;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary, String departmentName) {
        if (departmentName.equalsIgnoreCase("HR")) {
            this.salary = salary;
        } else {
            System.out.println("not allowed to set salary");
        }
    }
}