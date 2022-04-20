public class Employee {
    int id;
    String firstName, lastName;
    int salary;
    public Employee(int ID, String fName, String lName, int Salary){
        id = ID;
        firstName = fName;
        lastName = lName;
        salary = Salary;
    }
    public int getID(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName +" "+ lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSalary(int percent){
        return salary += (salary*percent);
    }
    public String toString(){
        return "Employee[id= "+ id+ ", name= "+ firstName+" "+ lastName+ ", salary= "+ salary+ "]";
    }
}
