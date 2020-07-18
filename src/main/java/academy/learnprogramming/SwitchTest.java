package academy.learnprogramming;

public class SwitchTest {

    public static void main(String[] args) {

//        int value = 5;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else if (value == 3) {
//            System.out.println("Value was 3");
//        } else {
//            System.out.println("Was not 1 nor 2 nor 3");
//        }

        int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4: case 5: case 6:
                System.out.println("Value was 4 or 5 or 6");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 nor 2 nor 3 nor 4-6");
                break;
        }

        char charValue = 'M';
        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + "was found");
                break;
            default:
                System.out.println("Could not find A, B, C, D or E");
                break;
        }

        String month = "jAnUaRy";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
            break;
        }

    }
}
