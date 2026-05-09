
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound();
    }
}
/*
Here:
Reference type = Animal
Object type = Dog

What Happens Internally?

Step 1: Compile Time
Compiler checks:
Does Animal class have sound()?
✔ Yes → code compiles

Step 2: Runtime
JVM checks:
Actual object type
Object is:
Dog
So JVM executes:
Dog's sound()

*/
