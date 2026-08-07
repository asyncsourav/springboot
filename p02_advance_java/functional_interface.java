

@FunctionalInterface
interface Shruti {
    public int add(int a, int b);    
}


public class functional_interface {
    public static void main(String[] args) {
        
        Shruti sourav = (int a, int b) -> {
            return a + b;
        };

        System.out.println(sourav.add(46, 57));
    }
}
