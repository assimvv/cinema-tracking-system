import java.util.Date;

public class Ticket {

    private int id;
    private int userId;
    private int movieId;

    public Ticket(int id, int userId, int movieId) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
    }

    public int getId() {
        return this.id;
    }
}
