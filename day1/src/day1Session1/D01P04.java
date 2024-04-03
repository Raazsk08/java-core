package day1Session1;

import java.util.Scanner;

public class D01P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number representing the week: ");
        int weekNumber = scanner.nextInt();

            if (weekNumber >= 1 && weekNumber <= 7) {
  	      if (weekNumber == 1) {
               	System.out.println("Monday");
            } else if (weekNumber == 2) {
                System.out.println("Tuesday");
            } else if (weekNumber == 3) {
                System.out.println("Wednesday");
            } else if (weekNumber == 4) {
                System.out.println("Thursday");
            } else if (weekNumber == 5) {
                System.out.println("Friday");
            } else if (weekNumber == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else {
            
            System.out.println("Invalid Input");
        }
    }
}
