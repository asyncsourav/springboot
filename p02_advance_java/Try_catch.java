public class Try_catch {
    public static void main(String[] args) {
        

        int a = 18;
        int b = 0; // this will throw an error and the code execution stops here - It do not goes forward from here 

        int c = 0;
        
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Something went wrong... " + e);
        }

        System.out.println("exiting the code");
    }
}
