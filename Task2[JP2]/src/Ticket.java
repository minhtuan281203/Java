import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private String name;
    private String ticketType;
    private int price;
    private String address;
    public Ticket(String name,String ticketType,int price,String address){
        this.name=name;
        this.ticketType=ticketType;
        this.price=price;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketType() {
        return ticketType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", ticketType='" + ticketType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<>();
        //add
        tickets.add(new Ticket("may bay","first class",1000000,"Phu minh-HN"));
        tickets.add(new Ticket("bus","regular",300000,"Bx my dinh"));
        tickets.add(new Ticket("may bay","business class",800000,"Phu minh-HN"));
        tickets.add(new Ticket("tau hoa","regular",400000,"120 le duan-HN"));
        System.out.println("Several types of tickets:");
        System.out.println("1. "+ tickets);

        Ticket bestTicket = tickets.get(0);
        Ticket lastTicket = tickets.get(tickets.size()-1);
        System.out.println("\nFirst: "+ bestTicket + " and last: "+ lastTicket);
        //edit
        tickets.set(2,new Ticket("bus","regular",350000,"Bx my dinh"));
        System.out.println("\n2. Ticket after set value: "+ tickets);
        //remove
        tickets.remove(tickets.size()-1);
        System.out.println("\n3. Ticket list after remove last index:");
        System.out.println(tickets);


    }
}
