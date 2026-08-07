

interface Random {
    void Show();
    void Config();
}

interface Random1 {
    void Run();
}

class Normal implements Random, Random1 {
    public void Show() {
        System.out.println("Aman Kumar Goswami");
    }

    public void Config() {
        System.out.println("Aditya Kumar Bharti");
    }

    public void Run() {
        System.out.println("Bishwajit Gorai");
    }
}

public class Implements {
    public static void main(String[] args) {
        
        Normal n1 = new Normal();
        n1.Show();
        n1.Config();
        n1.Run();
    }
}
