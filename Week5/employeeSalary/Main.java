package Week5.employeeSalary;

public class Main {
    static void main(String[] args) {
        Employee employee=new Employee(": LORD BEERUS");
        employee.setSalary(80000,"HR");
        System.out.println("name"+employee.getName());
        System.out.println("salary"+employee.getSalary());
    }
}
