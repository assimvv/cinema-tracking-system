public class Test {
    public static void main(String[] args) {
        CinemaTicketSystem cinema = new CinemaTicketSystem();
        int movieId1 = cinema.addMovie("Inception");
        int movieId2 = cinema.addMovie("Whiplash");

        cinema.showAllMovies();

        int userId1 = cinema.addUser("Assima");
        int userId2 = cinema.addUser("Magzhan");

        int ticketId1 = cinema.buyTicket(userId1, movieId2);
        int ticketId2 = cinema.buyTicket(userId2, movieId2);

        System.out.println(cinema.cancelTicket(ticketId2));
        System.out.println(cinema.cancelTicket(ticketId2));

    }
}
