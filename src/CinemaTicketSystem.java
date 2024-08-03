import java.util.ArrayList;

public class CinemaTicketSystem {

    private ArrayList<User> users;
    private ArrayList<Movie> movies;
    private ArrayList<Ticket> tickets;

    public CinemaTicketSystem() {
        this.users = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public int addMovie(String movieName) {
        int id = movies.size() + 1;
        Movie movie = new Movie(id, movieName);
        this.movies.add(movie);
        return id;
    }

    public void showAllMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public int addUser(String userName) {
        int id = users.size() + 1;
        User user = new User(id, userName);
        this.users.add(user);
        return id;
    }

    public int buyTicket(int userId, int movieId) {
        int ticketId = tickets.size() + 1;
        Ticket ticket = new Ticket(ticketId, userId, movieId);
        tickets.add(ticket);
        return ticketId;
    }

    public boolean cancelTicket(int ticketId) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getId() == ticketId) {
                tickets.remove(tickets.get(i));
                return true;
            }
        }
        return false;
    }


}
