package academy.learnprogramming;

public class WhileDoWhileTest<count> {

    public static void main(String[] args) {

//        int count = 1;
//        while (count != 6) {
//            System.out.println("A Count value is " + count);
//            count++;
//        }
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("B Count value is " + count);
//            count++;
//        }
//
//        count = 6;  //endless loop testing with if and break
//        do {
//            System.out.println("C Count value was " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);
//
//        System.out.println("--- " + count + " ---");
//
//        for (int i = 1; i < 7; i++) {
//            System.out.println("Count value is " + i);


        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumberFound++;
            if (evenNumberFound >= 5) {
                break;
            }
        }
        System.out.println("Total even number found = " + evenNumberFound);

//        int number = 4;
//        int finishNumber = 20;
//        while (number <= finishNumber) {
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
