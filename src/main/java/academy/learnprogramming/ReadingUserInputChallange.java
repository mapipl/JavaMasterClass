package academy.learnprogramming;

import java.util.Scanner;

public class ReadingUserInputChallange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

//        while (true) {
//            int order = counter + 1;
//            System.out.println("Enter number #" + order + ":");
//
//            boolean isAnInt = scanner.hasNextInt();
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
//                if (counter == 10) {
//                    break;
//                }
//            } else {
//                System.out.println("Invalid number");
//            }
//            scanner.nextLine(); // handle end of linie (enter key)
//
//        }

//        while (true) {
        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
//                if (counter == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of linie (enter key)

        }

        System.out.println("sum = " + sum);
        scanner.close();

    }
}