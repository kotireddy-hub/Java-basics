package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
    //System.out.println("Hello World");
        // 1. Get no of hours to work
        int hours = 0;
        System.out.println("How many hour did you work?");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //2. Get the payment for each hour
        double payRate = 25.50;
        System.out.println("what is you pay rate?");
        payRate = scanner.nextDouble();

        scanner.close();
        //3. Multiply the pay rate and hours
        double grossPay = hours * payRate;

        //4. Display the result
        System.out.println("Calculate pay rate "+ grossPay);
//
//        //1. Ask user to Season of the year
//        int year = 0;
//        System.out.println("Please Enter the Season of the Year?");
//        year = scanner.nextInt();
//
//        //2. Whole number
//        int wholeNumber = 0;
//        System.out.println("Please Enter the Whole Number?");
//        wholeNumber = scanner.nextInt();
//
//        //3.Adjective
//        String abj = "Hello";
//        System.out.println("Please Enter the Adjectives?");
//        abj = scanner.next();
//
//        //Display The Result
//        System.out.println("Display The result"+ year + "year" + wholeNumber + "wholeNumber"+ abj);

    }
}
