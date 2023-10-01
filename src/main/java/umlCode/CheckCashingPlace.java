package umlCode;

public class CheckCashingPlace {
    public static void main(String[] args) {

        // Array of people that are payable
        Employee[] employees ={
                new HourlyEmployee("Alex"),
                new SalariedEmployee("John"),
                new Entrepreneur("Luna")
        };



        // create an entrepreneur, salaried employee and hourly employee
        SalariedEmployee salaryEmployee = new SalariedEmployee("Mikaila");
        Entrepreneur entrepreneur = new Entrepreneur("Naiya");
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Leah");
        HumanResources.printBadge(salaryEmployee);
        HumanResources.issueBadges(employees);



    }


}
