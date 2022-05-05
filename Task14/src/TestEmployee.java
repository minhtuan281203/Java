public class TestEmployee {
    public static void main(String[] args) {
        Employee epl1= new EmployeeFull("as nuti",3000,10);
        System.out.println(epl1.getSalary());
        Employee epl2 = new EmployeePart("december", 2000, 8);
        System.out.println(epl2.getSalary());
        Employee epl3 = new Employee("ten", 3000);
        System.out.println(epl3.getSalary());
    }
}
