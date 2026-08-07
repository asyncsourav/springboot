

abstract class Car {

    public void Start() {
        System.out.println("Car started");
    }

    abstract void Drive();
    abstract void Music();
}

abstract class WagonR extends Car {
    @Override
    void Drive() {
        System.out.println("car is driving");
    }
}

class updatedWagonR extends WagonR {
    @Override
    void Music() {
        System.out.println("Car is playing music");
    }
}


public class abstarct_class {
    public static void main(String[] args) {
        
        updatedWagonR c1 = new updatedWagonR();
        c1.Drive();
        c1.Music();
        c1.Start();
    }
}
