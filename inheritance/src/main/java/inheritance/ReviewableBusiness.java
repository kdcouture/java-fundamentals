package inheritance;

import java.util.ArrayList;

public abstract class ReviewableBusiness {
    // Attributes common to all Reviewable Businesses
    public String name;
    public double stars;
    public ArrayList<Review> reviews;

    // Methods common to all Reviewable Businesses
    public void addReview(Review r) {
        this.reviews.add(r);
        this.updateStars();
    }

    public void updateStars() {
        double starcount = 0;
        for (Review rev: this.reviews) {
            starcount += rev.stars;
        }
        this.stars = (starcount/(this.reviews.size()));
    }
}
