
class Student {

    // 🔒 private data (hidden)
    private String name;
    private int rollno;

    // ✅ Setter methods (to set values)
    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    // ✅ Getter methods (to get values)
    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting values using methods
        s1.setName("Harsh");
        s1.setRollno(101);

        // Getting values using methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollno());
    }
}
/*
==================== STACK MEMORY ====================

main()
------------------------------------------------------
s1  ───────────────► (ref to Student Object)


        ↓ method call

setName("Harsh")
------------------------------------------------------
this ─────────────► Student Object
name = "Harsh" (parameter)


setRollno(101)
------------------------------------------------------
this ─────────────► Student Object
rollno = 101 (parameter)


getName()
------------------------------------------------------
this ─────────────► Student Object
returns "Harsh"


getRollno()
------------------------------------------------------
this ─────────────► Student Object
returns 101


==================== HEAP MEMORY =====================

Student Object
--------------------------
name = "Harsh"
rollno = 101


==================== METHOD AREA =====================

Class: Student
--------------------------
private variables: name, rollno
methods: setName(), setRollno(), getName(), getRollno()

Class: EncapsulationDemo
--------------------------
main() method
 */
