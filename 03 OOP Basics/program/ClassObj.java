
class Student {

    String name;
    int rollno;

    public Student() {
    }

    Student(int rollno, String name) {
        this.name = name;
        this.rollno = rollno;
    }

    void dispaly() {
        int Marks = 10;
        System.out.println("name : " + this.name);
        System.out.println("rollNo :" + this.rollno);

    }

}

public class ClassObj {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Harsh";
        System.out.println(s1.name);

        s2.name = "kuldip";
        System.out.println(s2.name);

        Student s3 = new Student(152, "H");
        s3.dispaly();

    }
}

/*
==================== STACK MEMORY ====================

main()
------------------------------------------------------
s1  ───────────────► (ref to Object 1)
s2  ───────────────► (ref to Object 2)
s3  ───────────────► (ref to Object 3)


            ↓ method call

dispaly()   (stack frame created)
------------------------------------------------------
Marks = 10
this  ─────────────► (ref to Object 3)


==================== HEAP MEMORY =====================

Student Object 1
--------------------------
name = "Harsh"
rollno = 0


Student Object 2
--------------------------
name = "kuldip"
rollno = 0


Student Object 3
--------------------------
name = "H"
rollno = 152


==================== METHOD AREA =====================

Class: Student
--------------------------
Variables: name, rollno
Methods: dispaly(), constructors

Class: ClassObj
--------------------------
main() method
 */
