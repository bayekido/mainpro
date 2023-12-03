class Teacher extends Person {
    private String specialization;

    public Teacher(String name, int age, boolean parentPermission, String specialization) {
        super(name, age, parentPermission);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}