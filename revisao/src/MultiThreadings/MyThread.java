package MultiThreadings;

public class MyThread extends Thread{


    @Override
    public void run(){

        for(int i=1; i < 11; i++){
            System.out.println("Thread #1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #1 is done");

    }
}
