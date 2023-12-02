<<<<<<< HEAD
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        App library = new App();
        while (!quit) {
            System.out.println("library");
            System.out.println("Choose an option:");
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
=======
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        

        App app=new App();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("WELCOME TO SCHOOL LIBRARY");
            System.out.println("Choose an option:");
            System.out.println("1. List all books");
            System.out.println("2. List all people");
            System.out.println("3. Create a person");
            System.out.println("4. Create a book");
            System.out.println("5. Create a rental");
            System.out.println("6. List rentals for a person");
            System.out.println("0. Quit the application");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            switch (choice) {
                case 1:
                    app.listAllBooks();
                    break;
                case 2:
                    app.listAllPeople();
                    break;
                case 3:
                    System.out.println("Create a person:");
                    app.createPerson();
                    break;
                case 4:
                    System.out.println("Create a book:");
                    app.createBook();
                    break;
                case 5:
                    System.out.println("Create a rental:");
                    app.createRental();
                    break;
                case 6:
                    System.out.println("List rentals for a person:");
                    System.out.print("Enter person ID: ");
                    int personId = scanner.nextInt();
                    app.listRentalsByPersonId(personId);
                    break;
                case 0:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        while (choice != 0);
    }
}
>>>>>>> origin/week5
