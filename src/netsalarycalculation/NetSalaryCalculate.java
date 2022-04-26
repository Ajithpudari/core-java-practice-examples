package netsalarycalculation;

public class NetSalaryCalculate {
    double grossSalary = 10000.00;
    double incomeTax = 500;
    double insurance =300.0;
    double pf=200.0;

    public void calculateNetSalary(){
        double deductions = insurance + incomeTax + pf;
        double netSalary = grossSalary-deductions;
        System.out.println("Gross Salary" +grossSalary);
        System.out.println("Deductions" +deductions);
        System.out.println("netSalary" +netSalary);
    }
}
