

interface abc {
    public void Show(int i);
}

interface xyz {
    public void Show();
}

public class Lambda_expression {
    public static void main(String[] args) {
        
        abc chombuu = (int i) -> {
            System.out.println("hello world " + i);
        };

        chombuu.Show(5);


        xyz shruti = () -> {
            System.out.println("Hello world from Sourav");
        };

        shruti.Show();
    }
}
