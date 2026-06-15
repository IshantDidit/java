package Week6.EmployeeSalaryCalculation;

public class Employee {
    private String name;
    private double salary;
    private double bonus;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void details(){
        System.out.println("enter the name"+name);
    }
    public double calcsalary(){
        return salary;
    }

}
