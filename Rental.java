<<<<<<< HEAD
class Rental {
    private Book book;
    private Person person;
    String date;

    public Rental(Book book, Person person) {
        this.book = book;
        this.person = person;

=======
import java.util.ArrayList;
import java.util.List;

public class Rental {
    private String date;
    private Book book;
    private Person person;


    public Rental(Book book,Person person) {
        this.book = book;
        this.person = person;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
>>>>>>> origin/week5
    }

    public Book getBook() {
        return book;
    }

<<<<<<< HEAD
=======
    public void setBook(Book book) {
        this.book = book;
        book.addRental(this);
    }

>>>>>>> origin/week5
    public Person getPerson() {
        return person;
    }

<<<<<<< HEAD
    public void setBook(Book book) {
    }
}
=======
    public void setPerson(Person person) {
        this.person = person;
        person.addRental(this);
    }
}
>>>>>>> origin/week5
