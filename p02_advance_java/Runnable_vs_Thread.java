

// * for thread 
/*
class Anushka extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " This is actually Shruti's Home name...");

            try {
                Thread.sleep(10); // after the above line is executed - now it will wait for some seconds to again get called 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Mandal extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Complete name is Shruti Mandal");

            try {
                Thread.sleep(10); // after the above line is executed - now it will wait for some seconds to again get called 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }  
    }
}

public class Threading {
    public static void main(String[] args) {
        
        Anushka sh = new Anushka();
        Mandal shr = new Mandal();

        // * set priority of the threads - we could only suggest this 
        // * actual work will be done by the machine itself
        // sh.setPriority(Thread.MAX_PRIORITY);
        // shr.setPriority(Thread.MIN_PRIORITY);

        sh.start();
        shr.start();
    }
}
*/


class Sonam implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Bag implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Runnable_vs_Thread {
    public static void main(String[] args) {
        
        Runnable s1 = new Sonam();
        Runnable s2 = new Bag();

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

        t1.start();
        t2.start();
    }
}
