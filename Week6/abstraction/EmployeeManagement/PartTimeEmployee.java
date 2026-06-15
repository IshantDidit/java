package Week6.abstraction.EmployeeManagement;

public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateSalary() {
        System.out.println("salary for part"+getSalary());
    }

    @Override
    public void displayDetails() {
        System.out.println("name"+getName());
        System.out.println("salary for partt"+getSalary());

    }

}
