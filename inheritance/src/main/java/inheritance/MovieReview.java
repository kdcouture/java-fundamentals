package inheritance;

public class MovieReview extends Review {
    // Attributes
    String movie;
    // Constructor
    public MovieReview (String author, double stars, String body, String movie) {
        super(author, body, stars);
        this.movie = movie;
    }

    // Methods

    public String toString() {
        return "Author: " + this.author + "\t||\tMovie: " + this.movie + "\t||\t Rating: " + this.stars + "\nBody: \t" + body + "\n";
    }
}
