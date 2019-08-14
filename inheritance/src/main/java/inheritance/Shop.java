package inheritance;

import java.util.ArrayList;

public class Shop extends ReviewableBusiness {

    public Shop(String name, double stars) {
        this.name = name;
        this.stars = stars;
        this.reviews = new ArrayList<>();
    }
    // Methods
    public String toString(){
        return ("Shop name: " + this.name + " Stars: " + this.stars + "\n" + reviews.toString());
    }
}
