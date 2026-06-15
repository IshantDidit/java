package Week6.EmployeeSalaryCalculation;

public class Developer extends Employee{
    private int noOfProject;

    public Developer(String name, double salary, int noOfProject) {
        super(name, salary);
        this.noOfProject = noOfProject;
    }

    @Override
    public double calcsalary() {
        return super.calcsalary()+(noOfProject*500);
    }
}
