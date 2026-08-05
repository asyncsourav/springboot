
class Student {
    int roll;
    int marks;
    String name;
}


public class Array_of_object {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.marks = 93;
        s1.name = "Sourav Kumar";
        s1.roll = 46;

        Student s2 = new Student();
        s2.marks = 90;
        s2.name = "Vasu Gorai";
        s2.roll = 57;

        Student s3 = new Student();
        s3.marks = 89;
        s3.name = "Aman Kumar Goswami";
        s3.roll = 9;


        Student[] student = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;


        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].name + " : " + student[i].marks);
        }

    }
}
