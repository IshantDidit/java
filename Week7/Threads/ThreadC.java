package Week7.Threads;

public class ThreadC implements Runnable {

    @Override
    public void run() {
        for (int i=1; i<=100;i++){
            System.out.println("Thread C");
        }
    }
}
