public class EmployeeFull extends Employee{
    private int day;
    public EmployeeFull(String name, int salary,int day){
        super(name,salary);
        this.day=day;
    }

    @Override
    public int getSalary() {
        return 150000* day;
    }

    @Override
    public String toString() {
        return "EmployeeFull{" +
                "day=" + day +
                "salary="+ getSalary()+
                '}';
    }
}
