package Week7.Threads;

public class ThreadA extends Thread{
    @Override
    public void run() {
        for (int i=1; i<=100;i++){
            System.out.println("hello");
        }
    }
}
