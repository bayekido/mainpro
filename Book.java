
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int id;
    private List<Rental> rentals;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        rentals = new ArrayList<>();
        this.id = (int)(Math.random()*10000000);
    }

    public static String getid() {

        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
        rental.setBook(this);
    }

    public int getId() {
        return id;
    }
}
