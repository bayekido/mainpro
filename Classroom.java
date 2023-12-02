<<<<<<< HEAD
import java.util.*;
=======
import java.util.ArrayList;
import java.util.List;

>>>>>>> origin/week5
public class Classroom {
    private String label;
    private List<Student> students;

    public Classroom(String label) {
        this.label = label;
<<<<<<< HEAD
        this.students = new ArrayList<>();
    }

=======
        students = new ArrayList<>();
    }

    // Setter and getter for label
>>>>>>> origin/week5
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

<<<<<<< HEAD
=======
    // Relationship methods for students
>>>>>>> origin/week5
    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
<<<<<<< HEAD
        student.setClassroom(String.valueOf(this));
        students.add(student);
    }
}
=======
        students.add(student);
        student.setClassroom(this);
    }
}

>>>>>>> origin/week5
