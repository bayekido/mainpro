
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<Book> books = new ArrayList<>();
    static List<Person> people = new ArrayList<>();
    static List<Rental> rentals = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static void listAllBooks() {
        System.out.println("Listing all books:");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    static void listAllPeople() {
        System.out.println("Listing all people:");
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

    static void createPerson() {
        System.out.println("Creating a person:");
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Does the person have parent permission? (yes/no):");
        String permission = scanner.nextLine();

        boolean hasParentPermission = permission.equalsIgnoreCase("yes");

        System.out.println("Is the person a teacher or a student? (teacher/student):");
        String type = scanner.nextLine();

        Person person;
        if (type.equalsIgnoreCase("teacher")) {
            System.out.println("Enter the subject:");
            String subject = scanner.nextLine();
            person = new Teacher(name,age,hasParentPermission);
        } else {
            System.out.println("Enter the grade:");
            int grade = scanner.nextInt();
            person = new Student(name,age,hasParentPermission);
        }

        people.add(person);
        System.out.println("Person created successfully.");
    }

    static void createBook() {
        System.out.println("Creating a book:");
        System.out.println("Enter the title:");
        String title = scanner.nextLine();
        System.out.println("Enter the author:");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        books.add(book);

        System.out.println("Book created successfully.");
    }

    static void createRental() {
        System.out.println("Creating a rental:");
        System.out.println("Enter the person ID:");
        int personId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter the book ID:");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Person person = findPersonById(personId);
        Book book = findBookById(bookId);

        if (person != null && book != null) {
            Rental rental = new Rental(book,person);
            rentals.add(rental);
            System.out.println("Rental created successfully.");
        } else {
            System.out.println("Person or book not found. Rental creation failed.");
        }
    }

    static void listRentalsForPerson() {
        System.out.println("Enter the person ID:");
        int personId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Person person = findPersonById(personId);

        if (person != null) {
            System.out.println("Listing rentals for person ID " + personId + ":");
            for (Rental rental : rentals) {
                if (rental.getPerson().getId() == personId) {
                    System.out.println(rental.toString());
                }
            }
        } else {
            System.out.println("Person not found.");
        }
    }

    private static Person findPersonById(int personId) {
        for (Person person : people) {
            if (person.getId() == personId) {
                return person;
            }
        }
        return null;
    }

    private static Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }

}