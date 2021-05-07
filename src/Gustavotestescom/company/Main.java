package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double number1, number2, result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your first note");
        number1 = scanner.nextDouble();

        System.out.println("Type your second note");
        number2 = scanner.nextDouble();

        result = (number1 + number2) / 2;

         if (result == 10) {
            System.out.println("You were approved with distinction");
        }
        else if (result > 7){
            System.out.println("You were approved");
        }
        else if (result < 7) {
            System.out.println("You were disapproved");
        }


    }
}
