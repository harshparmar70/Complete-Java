
class ImplementingRunnableInterface implements Runnable {

    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        ImplementingRunnableInterface obj = new ImplementingRunnableInterface();

        Thread t1 = new Thread(obj);

        t1.start();
    }
}
