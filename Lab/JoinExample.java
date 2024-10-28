class ExampleThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        ExampleThread t1 = new ExampleThread();
        ExampleThread t2 = new ExampleThread();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        
        ExampleThread t3 = new ExampleThread();
        t3.start();
        System.out.println("Is t1 alive? " + t1.isAlive());
    }
}
