import java.util.Scanner;

public class exception_handler {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("please enter the number you want to divide: ");
        int a = sc.nextInt();
        
        System.out.print("please enter the dividend: ");
        int b = sc.nextInt();
        sc.close();

        try {
            if (a / b == 0)
                throw new ArithmeticException("That is the default value"); // calls the constructor 
            System.out.println("The quotient is: " + a / b);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error encountered: " + e.getMessage());
            System.out.println(a / 1);
        }
        catch (Exception e) {
            System.out.println("Unhandled Exception: " + e);
        }

        System.out.println("Exit the code. Bye...");
    }
}
