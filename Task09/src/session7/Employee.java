package session7;

class Employee {
    String empID;
    String empName;
    int salary;
    float commission;

    public Employee(String id, String name, int sala){
        empID=id;
        empName=name;
        salary=sala;
    }
    public void calcCommission(float sale){
        if (sale>10000)
            commission = salary*20/100;
        else
            commission=0;
    }
    public void calcCommission(int overtime){
        if (overtime>8)
            commission= salary/30;
        else
            commission=0;
    }
    public void displayDetails(){
        System.out.println("employeeId:"+empID);
        System.out.println("employeeName:"+empName);
        System.out.println("Salary:"+salary);
        System.out.println("Commis:"+commission);
    }
}
