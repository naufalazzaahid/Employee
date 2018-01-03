/**
 * EmployeeClass
 *
 * @version 1.00 03/01/2017
 * @author Muhammad Naufal Azzaahid
 *
 * This code is for training purpose only
 */

public class EmployeeClass  implements Employee{
    private static int numberOfEmployee = 0;    //Tracking number of employee(s)
    protected String name;                      //Employee's name
    protected String address;                   //Employee's address
    protected int age;                          //Employee's age

    /** Constructor for testing */
    public EmployeeClass(){
        this.name  = "Test Only";
        this.address = "Test Only";
        this.age = 0;
    }

    /**
     * Constructor with parameter :
     * @param name : the name of employee in type of string
     * @param address : the address of employee in type of string
     * @param age : the age of employee in type of integer
     */
    protected EmployeeClass(String name, String address, int age){
        this.name  = name;
        this.address = address;
        this.age = age;
        numberOfEmployee++;
    }

    /** Employee's name getter */
    public String getName(){
        return this.name;
    }

    /** Employee's address getter */
    public String getAddress(){
        return this.address;
    }

    /** Employee's age getter */
    public int getAge(){
        return this.age;
    }

    /** Employee's salary getter
     * Every job has different salary,
     * will be overided in each classes.
     */
    public double getSalary(){
        return 0;
        //Overided in other class
    }

    /**
     * Printing work description of an employee
     * Every job has different work description,
     * will be overided in each classes.
     */
    public void printWorkDescription(){
        //Overided in other class
    }

    public int getNumberOfEmployee(){
        return this.numberOfEmployee;
    }
}
