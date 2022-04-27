package session7;

class PartTimeEmployee extends Employee{
    String shift;
    public PartTimeEmployee(String id, String name,int sala,String shift){
        super(id, name, sala);
        this.shift=shift;
    }
    @Override
    public void displayDetails(){
        calcCommission(12);
        super.displayDetails();
        System.out.println("Working shift: "+shift);
    }
}
