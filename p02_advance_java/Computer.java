

interface Comp {
    void Code();
}

class Laptop implements Comp {
    public void Code() {
        System.out.println("This is a working code");
    }
}

class Desktop implements Comp {
    public void Code() {
        System.out.println("This is faster working code");
    }
}

class Developer {
    public void Work(Comp Device) {
        Device.Code();
    }
}

public class Computer {
    public static void main(String[] args) {
        
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();

        Developer dev = new Developer();
        dev.Work(desk);
        dev.Work(lap);
    }
}
