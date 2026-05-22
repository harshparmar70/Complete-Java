
class ExtendingThreadClass extends Thread {

    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        // Use the actual class name here
        ExtendingThreadClass t1 = new ExtendingThreadClass();
        t1.start(); // Starts the thread and calls run()
    }
}
