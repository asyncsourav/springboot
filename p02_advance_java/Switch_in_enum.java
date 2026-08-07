

enum Status {
    Running, Completed, Failed, Pending
}

public class Switch_in_enum {
    public static void main(String[] args) {
        
        Status s = Status.Running;

        switch (s) {
            case Running:
                System.out.println("In progress...");
                break;
            
            case Completed:
                System.out.println("Work done...");
                break;

            case Failed:
                System.out.println("Please try again");
                break;

            default:
                System.out.println("All Good till now...");
                break;
        }
    }
}
