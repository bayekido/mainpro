class Teacher extends Person {
     String specialization;
    public Teacher(String name, int age, boolean parentPermission) {
        super(age,name, parentPermission);
        this.specialization = specialization;
    }
    @Override
    public boolean canUseServices() {
        return true;
    }
}
