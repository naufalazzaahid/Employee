/**
 * Engineer Class
 *
 * @version 1.00 03/01/2017
 * @author Muhammad Naufal Azzaahid
 *
 * This code is for training purpose only
 */

public class Engineer extends EmployeeClass{
    protected double salary = 2000000;      //Salary of engineer

    /**
     * Constructor with parameter :
     * @param name : the name of employee in type of string
     * @param address : the address of employee in type of string
     * @param age : the age of employee in type of integer
     * This class is a derived class of EmployeeClass, using super
     * for the same constructor as EmployeeClass
     */
    public Engineer(String name, String address, int age){
        super(name,address,age);
    }

    /**
     * Constructor with parameter addition:
     * @param isProjectFinished : finished project in type of boolean
     * If engineer X has finished a project,
     * the salary will be 0.5m higher than normal
     */
    public Engineer(String name, String address, int age,
                    boolean isProjectFinished){
        super(name, address, age);

        if (isProjectFinished) {
            salary += 500000;
        }
    }

    /** Engineer's salary getter */
    public double getSalary(){
        return salary;
    }

    /** Engineer Work Description Printer */
    public void printWorkDescription(){
        System.out.println("Engineer " + this.name
                            + " duty = Maintain electricity system");
    }
}
