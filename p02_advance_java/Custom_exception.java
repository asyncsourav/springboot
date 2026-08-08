import java.util.Scanner;


class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

public class Custom_exception {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("please enter the number you want to divide: ");
        int a = sc.nextInt();
        
        System.out.print("please enter the dividend: ");
        int b = sc.nextInt();
        sc.close();

        try {
            if (a / b == 0)
                throw new MyException("This is my custom Exception"); // calls the default constructor 
            System.out.println("The quotient is: " + a / b);
        } 
        catch (MyException e) {
            System.out.println("Error encountered: " + e.getMessage());
            System.out.println(a / 1);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unhandled Exception: " + e);
        }

        System.out.println("Exit the code. Bye...");
    }
}
