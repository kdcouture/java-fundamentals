/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testRestaurantConstruct() {
        Restaurant testaurant = new Restaurant("testaurant", 5, "$$");
        assertEquals("testaurant", "testaurant", testaurant.name);
        assertEquals("5", 5, testaurant.stars, .00005);
        assertEquals("$$", "$$", testaurant.price);
       }

    @Test public void testReviewconstuct() {
        Review testRev = new Review("Bubbles", "Decent", 5);
        assertEquals("Bubbles", "Bubbles", testRev.author);
        assertEquals("Decent", "Decent", testRev.body);
        assertEquals("5", 5, testRev.stars, .00005);
    }

    @Test public void testAddReviewRestaurant() {
        Restaurant testaurant = new Restaurant("testaurant", 5, "$$");
        Review testRev = new Review("Bubbles", "Decent", 5);
        testaurant.addReview(testRev);
        assertEquals("Bubbles","Bubbles", testaurant.reviews.get(0).author);
        assertEquals("5",5, testaurant.reviews.get(0).stars, .00005);
        assertEquals("Decent","Decent", testaurant.reviews.get(0).body);
    }

    @Test public void testAddReviewShop() {
        Shop testShop = new Shop("testaurant", 5);
        Review testRev = new Review("Bubbles", "Decent", 5);
        testShop.addReview(testRev);
        assertEquals("Bubbles","Bubbles", testShop.reviews.get(0).author);
        assertEquals("5",5, testShop.reviews.get(0).stars, .00005);
        assertEquals("Decent","Decent", testShop.reviews.get(0).body);
    }

    @Test public void testAddReviewTheater() {
        Theater testTheater = new Theater("testaurant", 5);
        MovieReview testRev = new MovieReview("Bubbles", 5, "Decent", "Trailer Park Boys");
        testTheater.addReview(testRev);
        assertEquals("Bubbles","Bubbles", testTheater.reviews.get(0).author);
        assertEquals("5",5, testTheater.reviews.get(0).stars, .00005);
        assertEquals("Decent","Decent", testTheater.reviews.get(0).body);
        assertEquals("Trailer Park Boys","Trailer Park Boys", testTheater.reviews.get(0).movie);
    }

    @Test public void testAddMovie() {
        Theater testTheater = new Theater("Theater", 5);
        testTheater.addMovie("Trailer Park Boys");
        assertEquals("Trailer Park Boys", "Trailer Park Boys", testTheater.movies.get(0));
    }

    @Test public void testStarsRestaurant() {
        Restaurant testaurant = new Restaurant("testaurant", 3, "$$");
        assertEquals("5", 3, testaurant.stars, .00005);
        testaurant.addReview(new Review("Bubbles", "Decent", 5));
        testaurant.addReview(new Review("Julian", "I've got a plan to make this big bubs", 3));
        assertEquals("4.0", 4.0, testaurant.stars, .00005);
    }

    @Test public void testStarsShop() {
        Shop testShop = new Shop("testaurant", 3);
        assertEquals("5", 3, testShop.stars, .00005);
        testShop.addReview(new Review("Bubbles", "Decent", 5));
        testShop.addReview(new Review("Julian", "I've got a plan to make this big bubs", 3));
        assertEquals("4.0", 4.0, testShop.stars, .00005);
    }

    @Test public void testStarsTheater() {
        Theater testTheater = new Theater("testaurant", 5);
        MovieReview testRev = new MovieReview("Bubbles", 5, "Decent", "Trailer Park Boys");
        testTheater.addReview(new MovieReview("Julian", 3, "Good", "Trailer Park Boys"));
        testTheater.addReview(testRev);
        assertEquals("4.0", 4.0, testTheater.stars, .00005);
    }

    @Test public void toStrings(){
        assertEquals("Restaurant name: Restaurant Stars: 5.0 Price: $$\n[]", new Restaurant("Restaurant", 5, "$$").toString());
        assertEquals("Shop name: Shop Stars: 5.0\n[]", new Shop("Shop", 5).toString());
        assertEquals("Theater name: Theater Stars: 5.0\n[]", new Theater("Theater", 5).toString());
    }
}
