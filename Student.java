class Student extends Person {
    private String classroom;


    public Student(String name, int age,boolean parent_permission,String classroom) {
        super(name, age, parent_permission);
        this.classroom = classroom;

    }
    public String  getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom)
    {
        this.classroom = classroom;
    }
}
