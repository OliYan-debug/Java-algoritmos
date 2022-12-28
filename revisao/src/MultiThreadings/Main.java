package MultiThreadings;

public class Main {

    public static void main(String[] args) {

        // Make a Thread 1
        MyThread thread1 = new MyThread();

        // Make a Thread 2
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);



        thread1.start();
        thread2.start();
    }


}
