import java.util.ArrayList;
import java.util.List;

class Person implements Nameable {
    private static int nextId = 1;
    private int id;
    private String name;
    private int age;
    private boolean parentPermission;
    private List<Rental> rentals;


    public boolean isParentPermission() {
        return parentPermission;
    }

    public Person(String name, int age,boolean parentPermission) {
        this.name = name;
        this.age = age;
        this.parentPermission = parentPermission;
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String getCorrectName() {

        if (name.length() > 10) {
            return name.substring(0, 10).toUpperCase();
        } else {
            return name.toUpperCase();
        }
    }


    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);

    }
}