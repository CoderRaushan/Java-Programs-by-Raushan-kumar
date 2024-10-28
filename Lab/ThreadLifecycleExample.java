class LifecycleThread extends Thread 
{
    public void run() {
        System.out.println("Running: " + this.getName());
    }
}

public class ThreadLifecycleExample {
    public static void main(String[] args) throws InterruptedException 
    {
        LifecycleThread t1 = new LifecycleThread();
        System.out.println("Thread State after creation: " + t1.getState()); 
        t1.start();
        System.out.println("Thread State after start: " + t1.getState()); 
        t1.join(); 
        System.out.println("Thread State after join: " + t1.getState()); 
    }
}
