import java.util.ArrayList;

public class User {

    private String name;
    private int id;
    private ArrayList<Ticket> tickets;

    public User(int id, String name) {
        this.name = name;
        this.id = id;
        this.tickets = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<Ticket> getTickets() {
        return this.tickets;
    }

    public void setName(String name) {
        // TODO: check for capitalized letter
        this.name = name;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("You cannot create a User with negative value of ID");
        }
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).equals(ticket)) {
                tickets.remove(tickets.get((i)));
            }
        }
    }

    public static void main(String[] args) {

        User myUser = new User(1, "Asima");


    }





}
