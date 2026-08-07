

enum Status {
    Running, Completed, Pending, Rejected
}


public class enum_class {
    public static void main(String[] args) {
        
        Status s = Status.Completed;
        System.out.println(s); // value of the Status enum that we have assigned to that inum
        System.out.println(s.ordinal()); // index of Status field

        Status[] ss = Status.values();

        for (Status st : ss) {
            System.out.println(st + " : " + st.ordinal());
        }
    }
}
