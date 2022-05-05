public class EmployeePart extends Employee{
    private int hour;
    public EmployeePart(String name, int salary, int hour){
        super(name,salary);
        this.hour=hour;
    }

    @Override
    public int getSalary() {
        return hour * 100000;
    }

    @Override
    public String toString() {
        return "EmployeePart{" +
                "hour=" + hour +
                "salary=" + getSalary() +
                '}';
    }
}
