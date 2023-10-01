package demo;

public class Main {
    public static void main(String[] args) {
        HireDate hireDate1 = new HireDate("Monday","January","2003");
        HireDate hireDate2 = new HireDate("26","8","1997");
        Employee employee = new Employee(hireDate1);

        Employee employee2 = new Employee(hireDate2);
        System.out.println(employee);
        System.out.println();
        System.out.println(hireDate1);
        System.out.println(employee2);
    }
}
