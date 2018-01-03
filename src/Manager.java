/**
 * Manager Class
 *
 * @version 1.00 03/01/2017
 * @author Muhammad Naufal Azzaahid
 *
 * This code is for training purpose only
 */

public class Manager extends EmployeeClass{
    protected double salary = 5000000;       //Salary of manager

    /**
     * Constructor with parameter :
     * @param name : the name of employee in type of string
     * @param address : the address of employee in type of string
     * @param age : the age of employee in type of integer
     * This class is a derived class of EmployeeClass, using super
     * for the same constructor as EmployeeClass
     */
    public Manager(String name, String address, int age){
        super(name,address,age);
    }

    /**
     * Constructor with parameter addition:
     * @param projectDeal : finished project in type of boolean
     * If manager X has finished some Y project,
     * there will be an anddtion to salary of salary * Y
     */
    public Manager(String name, String address, int age, int projectDeal){
        super(name, address, age);
        salary += salary * projectDeal;
    }

    /** Manager's salary getter */
    public double getSalary(){
        return salary;
    }

    /** Engineer Work Description Printer */
    public void printWorkDescription(){
        System.out.println("Manager " + this.name
                            + " duty = Managing business-things of our company");
    }
}
