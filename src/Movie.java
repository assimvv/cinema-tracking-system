public class Movie {

    private int id;
    private String movieName;

    public Movie(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public String toString() {
//        return "Movie with name " + this.movieName + " and ID " + this.id;
        return this.id + ": " + this.movieName;
    }


}
