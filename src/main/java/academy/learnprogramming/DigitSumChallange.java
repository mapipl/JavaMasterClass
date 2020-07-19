package academy.learnprogramming;

public class DigitSumChallange {

    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        //125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5

        int sum = 0;
        while (number > 0) {
            //extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            //drop the leas-significant digit
            number /= 10;    //same as number = number / 10;
        }
        return sum;
    }

}
