
class A extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("A: " + i);
        }
    }
}

class B extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("B: " + i);
        }
    }
}

public class MultipleThreads {

    public static void main(String[] args) {

        A t1 = new A();
        B t2 = new B();

        t1.start();
        t2.start();
    }
}
//Threads execute concurrently

/*
| Method    | Purpose             |
| --------- | ------------------- |
| start()   | Start thread        |
| run()     | Thread code         |
| sleep()   | Pause thread        |
| join()    | Wait for thread     |
| isAlive() | Check thread status |

*/
