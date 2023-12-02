<<<<<<< HEAD
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
=======

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
>>>>>>> origin/week5
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

<<<<<<< HEAD

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
=======
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

>>>>>>> origin/week5
