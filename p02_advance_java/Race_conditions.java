


// syncronized -> It will stop all the threads to use it at once - Only one thread could use it at a time

class Counter {
    int count;

    public synchronized void Increament() { // syncronized in use
        count++;
        System.out.println("value: " + count);
    }
}


public class Race_conditions {
    public static void main(String[] args) throws InterruptedException {

        Counter c1 = new Counter();
        
        // directly making the object 
        Runnable t1 = () -> {
            for (int i = 0; i < 2000; i++) {
                System.out.println("First");
                c1.Increament();
            }
        };
        
        Runnable t2 = () -> {
            for (int i = 0; i < 2000; i++) {
                System.out.println("Second");
                c1.Increament();
            }
        };

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(c1.count);
    }
}
