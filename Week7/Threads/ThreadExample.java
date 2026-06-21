package Week7.Threads;

public class ThreadExample {
    static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.start();
        ThreadB threadB = new ThreadB();
        threadB.start();
        Thread thread = new Thread(new ThreadC());
        thread.start();

    }
}