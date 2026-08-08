

class Anushka extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " This is actually Shruti's Home name...");
        }
    }
}

class Mandal extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Complete name is Shruti Mandal");
        }
        
    }
}

public class Threading {
    public static void main(String[] args) {
        
        Anushka sh = new Anushka();
        Mandal shr = new Mandal();

        sh.start();
        shr.start();
    }
}
