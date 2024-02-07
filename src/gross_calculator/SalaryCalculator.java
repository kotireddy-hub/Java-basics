package gross_calculator;
/*
If Statement.
All Employees get payment for a week $1000
Sale People Reached 10 goals an addition bonus to $250
*/

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String [] args){
        // Initialization of know values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("Enter how many employee did goals?");
        Scanner scanner = new Scanner(System.in);
        int sale = scanner.nextInt();
        scanner.close();
        // put condition

        if(sale > quota)
            salary = salary + bonus;

        System.out.println("The Employee's pay is $" + salary);

    }
}
