package Week6.abstraction.EmployeeManagement;

public class Main {

    static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("SOdefRH",40000);
        fullTimeEmployee.calculateSalary();
        fullTimeEmployee.displayDetails();
        Employee partTimeEmployee = new PartTimeEmployee("ssfdflf",5995);
        partTimeEmployee.calculateSalary();
        partTimeEmployee.displayDetails();
    }

}
