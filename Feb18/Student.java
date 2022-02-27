package Feb18;

public class Student {
    public String name;
    public int rollNo;
    public String phone;

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "John";
        st1.rollNo = 2;
        st1.phone = "+91-7060935890";

        Student st2 = new Student();
        st2.name = "Sam";
        st2.rollNo = 9;
        st2.phone = "+91-7985935890";

        System.out.printf("\nName: %s\n Roll No. = %d\n Phone no. : %s\n ",st1.name, st1.rollNo, st1.phone);

        System.out.printf("Name: %s\n Roll No. = %d\n Phone no. : %s\n ",st2.name, st2.rollNo, st2.phone);
    }
}
