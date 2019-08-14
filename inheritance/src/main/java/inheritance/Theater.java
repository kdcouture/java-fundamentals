package inheritance;

import java.util.ArrayList;

public class Theater extends ReviewableBusiness {
    // Attribute
    public ArrayList<String> movies;
    public ArrayList<MovieReview> reviews;

    // Constructor
    public Theater(String name, double stars){
        this.name = name;
        this.stars = stars;
        this.reviews = new ArrayList<MovieReview>();
        this.movies = new ArrayList<String>();
    }

    // Methods

    public void addReview(MovieReview r) {
        this.reviews.add(r);
        this.updateStars();
    }
    public void updateStars() {
        double starcount = 0;
        for (MovieReview rev: this.reviews) {
            starcount += rev.stars;
        }
        this.stars = (starcount/(this.reviews.size()));
    }

    public void addMovie(String s){
        this.movies.add(s);
    }

    public String toString(){
        return ("Theater name: " + this.name + " Stars: " + this.stars + "\n" + reviews.toString());
    }
}
