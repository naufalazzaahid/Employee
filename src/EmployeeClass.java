public class EmployeeClass  implements Employee{
    protected String name;
    protected String address;
    protected int age;
    private static int numberOfEmployee = 0;

    public EmployeeClass(){
        this.name  = "Test Only";
        this.address = "Test Only";
        this.age = 0;
    }

    protected EmployeeClass(String name,String address ,int age){
        this.name  = name;
        this.address = address;
        this.age = age;
        numberOfEmployee++;
    }


    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public int getAge(){
        return this.age;
    }

    public int getNumberOfEmployee(){
        return this.numberOfEmployee;
    }

    public double getSalary(){
        return 0;
        //Overided in other class
    }
    public void workSpace(){
        //Overided in other class
    }
}
