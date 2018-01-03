/**
 * Printing Session Class
 *
 * @version 1.00 03/01/2017
 * @author Muhammad Naufal Azzaahid
 *
 * This code is for training purpose only
 */

public class PrintingSessionm {
    public static void main(String[] args){
        /**
         * Trying to instantiate an example of engineer class,
         * and printing some getters.
         */
        EmployeeClass Riki = new Engineer("Riki","Cimahi",25);
        System.out.println(Riki.getName());
        System.out.println(Riki.getAddress());
        System.out.println(Riki.getAge());
        System.out.println(Riki.getSalary());
        Riki.printWorkDescription();
        SalaryTaxCalculator tax = new SalaryTaxCalculator();
        tax.calculateTaxSalary(Riki);
    }
}
