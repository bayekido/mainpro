<<<<<<< HEAD
class Student extends Person {
    private String classroom;


    public Student(String name, int age,boolean parent_permission,String classroom) {
        super(name, age, parent_permission);
=======
public class Student extends Person {
    private Classroom classroom;

    public Student(int age, String name,  boolean parentpermission) {
        super(age,name, parentpermission);
>>>>>>> origin/week5
        this.classroom = classroom;

    }
    public String  getClassroom() {
        return classroom;
    }

<<<<<<< HEAD
    public void setClassroom(String classroom)
    {
        this.classroom = classroom;
    }
}
=======


    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Classroom getClassroom() {
        return classroom;
    }
}
>>>>>>> origin/week5
