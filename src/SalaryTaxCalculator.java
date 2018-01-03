/**
 * SalaryTaxCalculator Class
 *
 * @version 1.00 03/01/2017
 * @author Muhammad Naufal Azzaahid
 *
 * This code is for training purpose only
 */

public class SalaryTaxCalculator {
    private double salary;              //Employee's Salary

    /**
     * Method with parameter :
     * @param employee : employee as object
     */
    public void calculateTaxSalary(EmployeeClass employee) {
        salary = employee.getSalary();  //Getting salary from object employee

        /**
         * There are several types of tax implementation
         * 1. Under 1 million = free tax
         * 2. Between 1 million and 2 million = 10% tax
         * 3. Over 2 million = 20% tax
         * After determining the tax, it should print the net salary
         */
        if (salary < 1000000)  {
            System.out.println("Congratulation " + employee.getName() + ". You are tax-Free!");
        } else if (salary < 2000000) {
            System.out.println("10% tax for " + employee.getName() + ". Net Salary : "
                                + salary * 0.9);
        } else {
            System.out.println("20% tax for " + employee.getName() + ". Net Salary : "
                                + salary * 0.8);
        }
    }
}
