public class PrintingSessionm {
    public static void main(String[] args){
        EmployeeClass test = new EmployeeClass();
        EmployeeClass Riki = new Engineer("Riki","Cimahi",25);
        System.out.println(Riki.getName());
        System.out.println(Riki.getAddress());
        System.out.println(Riki.getAge());
        System.out.println(Riki.getSalary());
        Riki.workSpace();
        SalaryTaxCalculator tax = new SalaryTaxCalculator();
        tax.afterTaxSalary(Riki);
    }
}
