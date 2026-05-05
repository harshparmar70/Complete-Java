
class Student {

    String name;
    int marks;

    void display() {
        System.out.println(name + " " + marks);
    }
}

public class ArrayOfObj {

    public static void main(String[] args) {

        // Student[] s = new Student[2];
        // s[0] = new Student();
        // s[1] = new Student();
        // s[0].name = "A";
        // s[0].marks = 90;
        // s[1].name = "B";
        // s[1].marks = 80;
        // s[0].display();
        // s[1].display();
        Student[] s = new Student[3];

        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
            s[i].name = "Student" + i;
            s[i].marks = 70 + i;
            s[i].display();
        }
    }
}
