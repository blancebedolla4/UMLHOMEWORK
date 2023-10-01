package demo;

public class Employee {
    public HireDate hireDate;

    public Employee(HireDate hireDate) {
        this.hireDate = hireDate;
    }
    // default constructor
//    public Employee() {
//       hireDate = new HireDate("1","09","1007");
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "hireDate=" + hireDate +
                '}';
    }
}
