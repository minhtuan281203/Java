package session7;

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee objEmp = new Employee("Emp01", "December", 40000);
        objEmp.calcCommission(2000000F);
        objEmp.displayDetails();

        System.out.println("------------------------------");
        Employee objEmp1= new PartTimeEmployee("Emp02", "October", 30000,"Day");
        objEmp1.displayDetails();
    }
}
