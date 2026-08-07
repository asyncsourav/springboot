
// * all methods inside an Abstract class is an abstract fucntion
// * then that class could also be defined as interface 

interface Random {
    void Show();
    void Config();

    // we cannot define any instance variable here - if we define then we have to also set it's value here only 
    // int age;
    // String name;
    
    // But we could define it - with it's value
    int age = 54;
    String name = "Sourav Kumar";

    // But - even tough we define it here - we could not use these in any object.
}

public class Interface {
    public static void main(String[] args) {
        
        Random r1 = new Random() {
            public void Show() {
                System.out.println("This is Aman Kumar Goswami");
            }

            public void Config() {
                System.out.println("This is Nishwajit Gorai");
            }
        };

        r1.Show();
        r1.Config();
    }
}