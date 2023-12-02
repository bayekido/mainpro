import java.util.*;

class App {
    private List<Book> books = new ArrayList<>();
    private static List<Person> people = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();
    private  static Date date;

    public static void createPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a 1.teacher or 2.student? (1/2): ");
        String personType = scanner.nextLine().toUpperCase();

        System.out.print("Enter person's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter person's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Does the person have parent permission? (true/false): ");
        System.out.println(" use only the words 'true' or 'false'");
        boolean parentPermission = scanner.nextBoolean();

        scanner.nextLine();

        if (personType.startsWith("T")) {
            System.out.print("Enter teacher's specialization: ");
            String specialization = scanner.nextLine();
            Teacher teacher = new Teacher(name, age, parentPermission, specialization);
            people.add(teacher);
            System.out.println("Teacher created successfully.");
        } else if (personType.startsWith("S")) {
            System.out.print("Enter student's class: ");
            String classroom = scanner.nextLine();
            Student student = new Student(name, age, parentPermission, classroom);
            people.add(student);
            System.out.println("Student created successfully.");
        } else {
            System.out.println("Invalid person type.");
        }
    }


    public void createBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book created successfully.");
    }

    public void listAllPeople() {
        System.out.println("List of people:");

        System.out.println("Teachers:");
        for (Person person : people) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Name: " + teacher.getCorrectName());
                System.out.println("Age: " + teacher.getAge());
                System.out.println("ID: " + teacher.getId());
                System.out.println("Specialization: " + teacher.getSpecialization());
                System.out.println();
            }
        }

        System.out.println("Students:");
        for (Person person : people) {
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Name: " + student.getCorrectName());
                System.out.println("Age: " + student.getAge());
                System.out.println("ID: " + student.getId());
                System.out.println("Classroom: " + student.getClassroom());
                System.out.println();
            }
        }
    }

    public void listAllBooks() {
        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println("Book Name: "+book.getTitle()) ;
            System.out.println("Author: "+book.getAuthor());
        }
    }

    public void createRental() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person ID: ");
        int personId = scanner.nextInt();
        scanner.nextLine();
        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        Book book = findBookByTitle(title);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        Rental rental = new Rental(book,person);

        rentals.add(rental);

        System.out.println("Rental created successfully.");
    }


    public void listRentalsForPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person ID: ");
        int personId = scanner.nextInt();
        scanner.nextLine();

        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }

        System.out.println("Rentals for " + person.getName() + ":");
        boolean foundRentals = false;
        for (Rental rental : rentals) {
            if (rental.getPerson().getId() == personId) {
                System.out.println("Book title:  "+rental.getBook().getTitle() ) ;
                System.out.println("Author:  "+ rental.getBook().getAuthor());
                foundRentals = true;
            }
        }

        if (!foundRentals) {
            System.out.println("No rentals found for " + person.getName());
        }
    }
    public void listRentalsById() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person ID: ");
        int personId = scanner.nextInt();
        scanner.nextLine();

        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }

        System.out.println("Rentals for " + person.getName() + ":");
        boolean foundRentals = false;
        for (Rental rental : rentals) {
            if (rental.getPerson().getId() == personId) {
                System.out.println("Book title:  "+rental.getBook().getTitle() ) ;
                System.out.println("Author:  "+ rental.getBook().getAuthor());
                foundRentals = true;
            }
        }

        if (!foundRentals) {
            System.out.println("No rentals found for " + person.getName());
        }
    }
    private Person findPersonById(int personId) {
        for (Person person : people) {
            if (person.getId() == personId) {
                return person;
            }
        }
        return null;
    }

    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}