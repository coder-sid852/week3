package Feb18;

public class Employee {
    String employeeName;
    int employeeID;

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.employeeName = "John";
        e1.employeeID = 221;
        Employee e2 = new Employee();
        e2.employeeName = "Josh";
        e2.employeeID = 223;
        Employee e3 = new Employee();
        e3.employeeName = "Joshua";
        e3.employeeID = 227;
        Employee e4 = new Employee();
        e4.employeeName = "Jacob";
        e4.employeeID = 239;

        System.out.printf("\nEmployee One Details:\n Employee Name : %s\n Employee ID = %d", e1.employeeName, e1.employeeID);
        System.out.printf("\nEmployee two Details:\n Employee Name : %s\n Employee ID = %d", e2.employeeName, e2.employeeID);
        System.out.printf("\nEmployee three Details:\n Employee Name : %s\n Employee ID = %d", e3.employeeName, e3.employeeID);
        System.out.printf("\nEmployee four Details:\n Employee Name : %s\n Employee ID = %d", e4.employeeName, e4.employeeID);
    }
}
