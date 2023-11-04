 class Person {
     int id;
    String name;
     int age;
     boolean parentPermission;

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
}
