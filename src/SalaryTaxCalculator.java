public class SalaryTaxCalculator {
    double salary;
    public void afterTaxSalary(EmployeeClass employee){
        salary = employee.getSalary();
        if(salary < 1000000){
            System.out.println("Congratulation "+ employee.getName() +" You are tax Free!");
        }else if(salary < 2000000){
            System.out.println("10% tax for "+ employee.getName() +". Net Salary : " + salary*0.9);
        }else{
            System.out.println("20% tax for "+ employee.getName() +". Net Salary : " + salary*0.8);
        }
    }
}
