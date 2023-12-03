import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        App library = new App();
        while (!quit) {
            System.out.println("WELL COME TO CENTRAL library");
            System.out.println("Choose an option that you want to do with :");
            System.out.println("1. Create a person");
            System.out.println("2. Create a book");
            System.out.println("3. List all people");
            System.out.println("4. List all books");
            System.out.println("5. Create a rental");
            System.out.println("6. List rentals for a person");
            System.out.println("7. Quit");
            System.out.println("end");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Create person");
                    library.createPerson();
                    break;
                case 2:
                    System.out.println("Create Book");
                    library.createBook();
                    break;
                case 3:
                    System.out.println("list of people");
                    library.listAllPeople();
                    break;
                case 4:
                    System.out.println("list Book");
                    library.listAllBooks();
                    break;
                case 5:
                    System.out.println("Create rental");
                    library.createRental();
                    break;
                case 6:
                    System.out.println("list of Rental");
                    library.listRentalsById();
                    break;
                case 7:
                    quit = true;
                    System.out.println("Thanks for using ");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
