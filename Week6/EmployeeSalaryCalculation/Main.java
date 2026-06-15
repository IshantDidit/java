package Week6.EmployeeSalaryCalculation;

public class Main {
    static void main(String[] args) {
        Manager manager = new Manager("Doreamon", 45000,4102);
        manager.details();
        System.out.println("the salary is  " + manager.calcsalary());

        Developer developer = new Developer("Sorma",12000,120);
        developer.details();
        System.out.println("the salary is "+developer.calcsalary());

    }
}
