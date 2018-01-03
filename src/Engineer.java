public class Engineer extends EmployeeClass{
    protected double salary = 2000000;
    private String duty;

    public Engineer(String name,String address ,int age){
        super(name,address,age);
    }

    public Engineer(String name,String address ,int age,boolean isProjectFinished){
        super(name,address,age);
        if(isProjectFinished){
            salary += 500000;
        }
    }

    public void workSpace(){
        System.out.println("Engineer " + this.name +" duty = Maintain electricity system");
    }

    public double getSalary(){
        return salary;
    }
}
