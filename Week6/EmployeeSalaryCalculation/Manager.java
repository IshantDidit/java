package Week6.EmployeeSalaryCalculation;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calcsalary() {
        return super.calcsalary() + bonus;
    }
}
