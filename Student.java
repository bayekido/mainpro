public class Student extends Person {
    private Classroom classroom;

    public Student(int age, String name,  boolean parentpermission) {
        super(age,name, parentpermission);
        this.classroom = classroom;
    }



    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Classroom getClassroom() {
        return classroom;
    }
}