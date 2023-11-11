
public class Student extends Person {
    private String classroom;

    public Student(int id, String name, int age, boolean parentPermission, String classroom) {
        super(age,name, parentPermission);
        this.classroom = classroom;
    }


}
