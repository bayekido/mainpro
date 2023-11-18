public class Student extends Person {
    private Classroom classroom;

    public Student(int id, String name, int age, boolean parent_permission, Classroom classroom) {
        super(id, name, parent_permission);
        this.classroom = classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Classroom getClassroom() {
        return classroom;
    }
}