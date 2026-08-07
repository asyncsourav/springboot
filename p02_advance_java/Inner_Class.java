

class Aman {
    int age = 22;

    public void printAge() {
        System.out.println("Your age is: " + age);
    }

    class Vasu {
        public void Marks() {
            System.out.println("The marks are satisfactory");
        }
    }
}


public class Inner_Class {
    public static void main(String[] args) {
        
        Aman amu = new Aman();
        amu.printAge();
        
        Aman.Vasu Nayra = amu.new Vasu();
        Nayra.Marks();
    }
}
