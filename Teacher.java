class Teacher extends Person {
<<<<<<< HEAD
    private String specialization;

    public Teacher(String name, int age, boolean parentPermission, String specialization) {
        super(name, age, parentPermission);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
=======
     String specialization;
    public Teacher(String name, int age, boolean parentPermission) {
        super(age,name, parentPermission);
        this.specialization = specialization;
    }
    @Override
    public boolean canUseServices() {
        return true;
>>>>>>> origin/week5
    }
}