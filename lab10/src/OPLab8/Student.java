package OPLab8;

import java.util.Comparator;

public class Student extends Human {
    public Student(String name, int age, String university) {
        super(name, age, university);

    }

    public Student() {
        super();
    }



    @Override
    public String toString() {
        return name;
    }


}
