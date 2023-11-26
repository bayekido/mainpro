
import java.util.ArrayList;
import java.util.List;

public class Person implements Nameable {
    int id;
    String name;
    int age;
    boolean parentpermission;
    private List<Rental> rentals;

    public Person(int age, String name, boolean parentpermission) {
        this.id = (int)(Math.random()*10000000);
        this.name = name;
        this.age = age;
        this.parentpermission = parentpermission;
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

    public boolean ofAge() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return ofAge() || parentpermission;
    }

    public String correct_name() {
        return name;
    }

    @Override
    public String getCorrectName() {
        return name;
    }

    public int getid() {
        return  id;
    }
}

