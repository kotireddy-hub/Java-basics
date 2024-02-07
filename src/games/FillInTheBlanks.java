package games;

import java.util.Scanner;

public class FillInTheBlanks {
    public static void main( String [] arg){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let Create Story!");
        System.out.println("Please Enter An Adjective?");
        String adjective = scanner.next();

        System.out.println("Please Enter the Season of the Year?");
        String season = scanner.next();

        System.out.println("Please Enter The Whole NUmber?");
        int wholeNumber = scanner.nextInt();
        scanner.close();

        //Display The Result
        System.out.println("Display The result"+ adjective + "year" + season + "wholeNumber"+ wholeNumber);


    }
}
