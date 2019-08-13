package inheritance;

public class Review {
    // Attributes
    String author;
    String body;
    double stars;

    // Constructor
    public Review(String author, String body, double stars) {
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    // Methods

    public String toString() {
        return "Author: " + this.author + "\t||\tRating: " + this.stars + "\nBody: \t" + body;
    }
}
