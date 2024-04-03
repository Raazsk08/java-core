package day1Session1;

import java.util.Scanner;

public class D01P03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 12: ");
        int monthNumber = scanner.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            
            String[] months = {"January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"};

      
            System.out.println(months[monthNumber - 1]);
        } else {
            System.out.println("Invalid Input");
        }
    }
}