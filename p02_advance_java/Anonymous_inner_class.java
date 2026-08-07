

class Aditya {
    public void Show() {
        System.out.println("It's Aditya Kumar Goswami....");
    }
}

public class Anonymous_inner_class {
    public static void main(String[] args) {
        
        Aditya amu1 = new Aditya();
        amu1.Show(); // Output - It's Aditya Kumar Goswami
        
        Aditya amu2 = new Aditya() {
            public void Show() {
                System.out.println("This is Vasu Dev Not Aditya. Faaaa ......");
            }
        };

        amu2.Show(); // Output - This is Vasu Dev Not Aditya. Faaaa ......
    }
}
