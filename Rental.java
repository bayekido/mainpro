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
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
        book.addRental(this);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        person.addRental(this);
    }
}