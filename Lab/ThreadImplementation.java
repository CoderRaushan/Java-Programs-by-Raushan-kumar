class Test extends Thread {
    public void run() {
        System.out.println("Thread is running....");
        try {
            for (int i = 1; i <= 5; i++) 
            {
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println("Thread id:"+Thread.currentThread().getId());
                System.out.println("Thread Name:"+Thread.currentThread().getName());
                System.out.println("Thread Priority:"+Thread.currentThread().getPriority());
                System.out.println("Thread isAlive:"+Thread.currentThread().isAlive());
                System.out.println("Thread IsDaemon:"+Thread.currentThread().isDaemon());
                System.out.println("Thread IsInterrupted:"+Thread.currentThread().isInterrupted());
            }
        } catch (Exception e) {
            System.out.println("exception in sleep():" + e);
        }
    }
}

public class ThreadImplementation {
    public static void main(String[] args) 
    {
        Test t1 = new Test();
        t1.start();
        t1.setName("Raushan");
        t1.setPriority(10);


        Thread.currentThread().setName("Main raushan thread");
        try 
        {
            for (int i = 1; i <= 5; i++) 
            {
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println("Main Thread id:"+Thread.currentThread().getId());
                System.out.println("Main Thread Name:"+Thread.currentThread().getName());
                System.out.println("Main Thread Priority:"+Thread.currentThread().getPriority());
                System.out.println("Main Thread isAlive:"+Thread.currentThread().isAlive());
                System.out.println("Main Thread IsDaemon:"+Thread.currentThread().isDaemon());
                System.out.println("Main Thread IsInterrupted:"+Thread.currentThread().isInterrupted());
                
            }
        } catch (Exception e) 
        {
            System.out.println("exception in sleep():" + e);
        }

    }
}