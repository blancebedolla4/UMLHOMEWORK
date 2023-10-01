package umlCode;



public class HumanResources {


    //get employees name, and then print it out
    public static void printBadge(Employee employee) {
        String employeeName = employee.getName();
        System.out.println(employeeName);
    }

    // takes an array of employeee objects and prints their badges
    public static void issueBadges(Employee[] employees) {
        for (Employee employee :employees) {
            System.out.println(employee.getName());


        }
    }


    //Method that takes a payable person and prints out their payment information
    // if instance of to print out different info per each corresponding employee

        public void printPaymentInfo(Employee employee){
           if(employee instanceof SalariedEmployee ) {
               System.out.println("Payment type : Salary, Salary Amount $" + ((SalariedEmployee) employee).calculatePay());
           }else if(employee instanceof HourlyEmployee){
                   System.out.println("Payment type: Hourly, Weekly amount $" +((HourlyEmployee)employee).calculatePay());
               }

               }

           }












