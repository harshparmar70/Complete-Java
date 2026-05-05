
class Student {

    String name;          // instance variable
    int rollno;           // instance variable
    static String college = "ABC College";  // ✅ static variable

    // Constructor
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // Instance method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollno);
        System.out.println("College: " + college);
    }

    // ✅ Static method
    static void changeCollege() {
        college = "XYZ College";
    }
}

class Static {

    int x = 10;

    public static void main(String[] args) {
        Static obj = new Static();   // create object
        System.out.println(obj.x);   // access using object

        // Call static method (without object)
        Student.changeCollege();
        Student s1 = new Student(101, "Harsh");
        Student s2 = new Student(102, "Kuldip");

        s1.display();
        s2.display();
    }
}
/*
==================== STACK MEMORY ====================

main()
------------------------------------------------------
obj ───────────────► (ref to Static Object)

s1  ───────────────► (ref to Student Object 1)
s2  ───────────────► (ref to Student Object 2)


        ↓ method call

display() for s1
------------------------------------------------------
this ─────────────► Student Object 1


display() for s2
------------------------------------------------------
this ─────────────► Student Object 2


==================== HEAP MEMORY =====================

Static Object
--------------------------
x = 10


Student Object 1
--------------------------
name = "Harsh"
rollno = 101


Student Object 2
--------------------------
name = "Kuldip"
rollno = 102


==================== METHOD AREA =====================

Class: Student
--------------------------
static college = "XYZ College"   ✅ (only ONE copy)
methods: display(), changeCollege()
constructors


Class: Static
--------------------------
main() method
 */
