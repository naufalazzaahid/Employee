public class Manager extends EmployeeClass{
    protected double salary = 5000000;
    private String duty;

    public Manager(String name,String address ,int age,int projectDeal){
        super(name,address,age);
        salary += salary*projectDeal;
    }

    public void workSpace(){
        System.out.println("Manager " + this.name +" duty = Managing business-things of our company");
    }

    public double getSalary(){
        return salary;
    }
}
