package umlCode;

public class SalariedEmployee extends Employee{

    public SalariedEmployee(String name) {
        super(name);
    }
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }
}
