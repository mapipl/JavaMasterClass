package academy.learnprogramming;

public class OperatorPrecedences {

    public static void main(String[] args) {

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theReminder = myValuesTotal % 40.00d;
        System.out.println("theReminder = " + theReminder);
        boolean isNoReminder = (theReminder == 0) ? true : false;
        System.out.println("isNoReminder = " + isNoReminder);
        if (!isNoReminder) {
            System.out.println("Got some reminder");
        }
    }
}
