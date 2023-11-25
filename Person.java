
import java.util.ArrayList;
import java.util.List;

public class Person implements Nameable {
    int id;
  String name;
  int age;
 boolean parent_permission=false;
    private List<Rental> rentals;
  
    public Person(int age, String name, boolean parentPermission) {
        this.id = generateId();
        this.name = name;
        this.age = age;
        this.parent_permission = parent_permission;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean ofAge() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return ofAge() || parent_permission;
    }

    public String correct_name() {
        return name;
    }
}
    @Override
    public String getCorrectName() {
        return name;
    }

