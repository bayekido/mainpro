
public class Teacher extends Person {
    private String specialization;

    public Teacher(int id, String name, int age, boolean parentPermission, String specialization) {
        super(id, name, age, parentPermission);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public boolean canUseServices() {
        return true;
    }
}