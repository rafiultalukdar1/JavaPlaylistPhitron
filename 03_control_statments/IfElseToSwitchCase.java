public class IfElseToSwitchCase {
    public static void main(String[] args) {

        // ********************************** problem 1: **********************************
        // initialize a variable with int value, if the variable is even then print even
        // and if the variable is odd then print odd.
        // ********************************************************************************

        int number = 12;

        switch ((number % 2)) {
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
        }

        // ********************************** problem 2: **********************************
        // initialize an integer n and determines whether it is negative, even, or odd.
        // ********************************************************************************

        int num = 3;

        // if (num >= 0) {
        //      if ((num % 2) == 1) {
        //          System.out.println("odd");
        //      }
        //      else {
        //          System.out.println("even");
        //      }
        // }
        // else {
        //     System.out.println("Negative");
        // }

        switch (Integer.signum(num)) {
            case 0:
            case 1:
                switch ((num % 2)) {
                    case 0:
                        System.out.println("Number: " + num);
                        System.out.println("Status: Positive Even");
                        break;
                    default:
                        System.out.println("Number: " + num);
                        System.out.println("Status: Positive Odd");
                }
                break;
            default:
                System.out.println("Number: " + num);
                System.out.println("Status: Negative");
                break;
        }

        // ********************************** problem 3: **********************************
        // initialize a variable mark int value. and print the greade according,
        // mark >= 90 -> A
        // mark < 90 and mark >= 80 -> A-
        // mark < 80 and mark >= 70 -> B
        // mark < 70 and mark >= 60 -> B-
        // else F
        // ********************************************************************************

        int mark = 90;

        switch ((mark / 10)) {
            case 1:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("A-");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("B-");
                break;
            default:
                System.out.println("F");
        }


        





    }
}