import java.util.*;

class App {
    private List<Book> books = new ArrayList<>();
    private static List<Person> people = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();
    private static Date date;

    public static void createPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a 1.teacher or 2.student? (1/2): ");
        String personType = scanner.nextLine().toUpperCase();

        System.out.print("Enter person's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter person's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Does the person have parent permission? (true/false): ");
        System.out.println(" use only the words 'true' or 'false'");
        boolean parentPermission = scanner.nextBoolean();

        scanner.nextLine();

        if (personType.startsWith("1")) {
            System.out.print("Enter teacher's specialization: ");
            String specialization = scanner.nextLine();
            Teacher teacher = new Teacher(name, age, parentPermission, specialization);
            people.add(teacher);
            System.out.println("Teacher created successfully.");
        } else if (personType.startsWith("2")) {
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
        System.out.println("List of people:\n");

        System.out.println("Teachers:");
        System.out.println("+------+-----------------+-----+------------------+");
        System.out.println("|  ID  |      Name       | Age | Specialization   |");
        System.out.println("+------+-----------------+-----+------------------+");
        for (Person person : people) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.printf("|%6d| %-15s| %3d | %-16s|\n", teacher.getId(), teacher.getCorrectName(), teacher.getAge(), teacher.getSpecialization());
            }
        }
        System.out.println("+------+-----------------+-----+------------------+\n");

        System.out.println("Students:");
        System.out.println("+------+-----------------+-----+-----------------+");
        System.out.println("|  ID  |      Name       | Age |    Classroom    |");
        System.out.println("+------+-----------------+-----+-----------------+");
        for (Person person : people) {
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.printf("|%6d| %-15s| %3d | %-15s|\n", student.getId(), student.getCorrectName(), student.getAge(), student.getClassroom());
            }
        }
        System.out.println("+------+-----------------+-----+-----------------+");
    }

    public void listAllBooks() {
        System.out.println("List of books:\n");
        System.out.println("+-----------------+-----------------+");
        System.out.println("|    Book Name    |      Author     |");
        System.out.println("+-----------------+-----------------+");
        for (Book book : books) {
            System.out.printf("| %-15s| %-15s|\n", book.getTitle(), book.getAuthor());
        }
        System.out.println("+-----------------+-----------------+");
    }

    public void createRental() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of people:");
        for (Person person : people) {
            System.out.println("ID: " + person.getId() + ", Name: " + person.getName());
        }
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

        Rental rental = new Rental(book, person);

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
                System.out.println("Book title:  " + rental.getBook().getTitle());
                System.out.println("Author:  " + rental.getBook().getAuthor());
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
                System.out.println("Book title:  " + rental.getBook().getTitle());
                System.out.println("Author:  " + rental.getBook().getAuthor());
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