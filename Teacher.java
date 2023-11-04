
class Teacher extends Person {
     String specialization;

    public Teacher(int id, String name, int age, boolean parentPermission, String specialization) {
        super(id, name, age, parentPermission);
        this.specialization = specialization;
    }

    @Override
    public boolean canUseServices() {
        return true;
    }
}
