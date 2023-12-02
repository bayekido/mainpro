keneni.A ......, [12/1/2023 1:12 PM]
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    static List<Book> books;
    List<Person> people;
    List<Rental> rentals;

    public App() {
        books = new ArrayList<>();
        people = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    void listAllBooks() {
        for (Book book : books) {
            System.out.println("List of all books.");
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
        }
    }

    void listAllPeople() {
        for (Person person : people) {
            System.out.println("List of all peoples.");
            System.out.println("ID:" + person.getid());
            System.out.println("NAME:" + person.getName());
            System.out.println("AGE:" + person.getAge());
            // System.out.println(people.toString());
        }
    }

    void createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the person a teacher or a student? [teacher]/[student]:");
        String type = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume the remaining newline character
        System.out.println("Does the person have parent permission? (true/false):");
        boolean ParentPermission;
        ParentPermission = scanner.nextBoolean();
        scanner.nextLine();

        Person person;
        if (type.equalsIgnoreCase("teacher")) {
            System.out.print("Enter specialization: ");
            String specialization = scanner.nextLine();
            Teacher teacher = new Teacher(name, age,ParentPermission);
            people.add(teacher);

            System.out.println("Person created successfully.");
        } else if (type.equalsIgnoreCase("student")) {
            boolean parentpermission = false;
            Student student = new Student( age,name, parentpermission);
            people.add(student);
            System.out.println("Student created successfully.");
        } else {
            System.out.println("Invalid person type.");
        }
    }

    void createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        scanner.nextLine();
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book created successfully.");
    }

    void createRental() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter person ID: ");
        int personId = scanner.nextInt();
        scanner.nextLine();
        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }
        System.out.print("Enter book Title: ");
        String bookTitle = scanner.nextLine();
        scanner.nextLine(); // Consume the remaining newline character

        keneni.A ......, [12/1/2023 1:12 PM]
        Book book = findBookByTitle(bookTitle);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        Rental rental = new Rental(book, person);
        rentals.add(rental);
        System.out.println("Rental created successfully.");
    }
    private int getPersonByid(int personid){
        return personid;
    }
    private String getBookByTitle(String bookTitle)
    {
        return bookTitle;
    }
    void listRentalsByPersonId(int personId) {
        Scanner scanner = new Scanner(System.in);
        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }
        System.out.println("Rentals for " + person.getName() + " (ID: " + person.getid() + "):");
        boolean rentalsFound = false;
        for (Rental rental : rentals) {
            if (rental.getPerson().getid() == personId) {
                System.out.println(rental.getBook().getTitle());
                System.out.println(rental.getBook().getAuthor());
                rentalsFound = true;
            }
        }
    }
    public Person findPersonById(int personId) {
        for (Person person : people) {
            if (person.getid() == personId) {
                return person;
            }
        }
        return null;
    }

    public static Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }}