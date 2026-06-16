package Week7.Threads;

public class ThreadB extends Thread{
    @Override
    public void run() {
        for (int i=1; i<=100;i++){
            System.out.println("hi");
        }
    }
}
