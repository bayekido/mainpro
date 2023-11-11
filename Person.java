<<<<<<< HEAD

class Person implements Nameable {
    int id;
    String name;
    int age;
    boolean parentPermission;
=======
 class Person {
     int id;
    String name;
     int age;
     boolean parentPermission;
>>>>>>> 1296fa2525f63014450be1bca9c7c3ce3ae12c58

    public Person(int age, String name, boolean parentPermission) {
        this.id = generateId();
        this.name = name;
        this.age = age;
        this.parentPermission = parentPermission;
    }

    private int generateId() {
        // Assume implementation for generating a unique ID
        return 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isOfAge() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return isOfAge() || parentPermission;
    }
<<<<<<< HEAD

    @Override
    public String getCorrectName() {
        return name;
    }
}
=======
}
>>>>>>> 1296fa2525f63014450be1bca9c7c3ce3ae12c58
