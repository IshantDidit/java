package Week4;
import java.util.Scanner;

public class Employeesalary {
    static int monthyWorkingHr=230;
    static double monthySalary=50000;
    static double bonusPerHr=2000;
    public static void calculateSalary(int workedHr){
        double finalSalary=0;
        if(workedHr>monthyWorkingHr){//cacl bonus
            finalSalary=monthySalary + calcBonus(workedHr);
        } else if (workedHr<monthyWorkingHr) {
           int lessHr=monthyWorkingHr-workedHr;
           double rate = monthySalary/monthyWorkingHr;
           finalSalary = monthySalary - (lessHr * rate);
        }
        else {
            finalSalary=monthySalary;
        }
        System.out.println("final salary"+finalSalary);

    }
    public static double calcBonus(int workedHr){
        int extraHr=workedHr-monthyWorkingHr;
        return extraHr * bonusPerHr;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the hr");
        int workedHr = sc.nextInt();
        calculateSalary(workedHr);

    }
}