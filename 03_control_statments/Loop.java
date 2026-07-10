public class Loop {

    public static void main(String[] args) {

        // * problem 1:
        // * -----------------------------
        // * print the 1st 10 even numbers

        System.out.println("Problem 1 Solve");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
        }

        int im = 1;
        while (im <= 10) {
            System.out.print(im*2 + " ");
            im++;
        }


        // * problem 2:
        // * --------------------------------
        // * FizzBuzz problem
        // * print numbers from 1 to 20
        // * if the number is divisible by 3, print "Fizz"
        // * if the number is divisible by 5, print "Buzz"
        // * if the number is divisible by 3 and 5, print "FizzBuzz"
        // * else print the number

        System.out.println("Problem 2 Solve");

        for (int i=1; i <=20; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            } else {
                System.out.println();
            }
        }

        // * problem 3:
        // * --------------------------------
        // * print the following pattern for n=5
        
        System.out.println("Problem 3 Solve");

        for (int row=1; row<5; row++) {
            for (int col=1; col<5; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        // * problem 4:
        // * -----------------------------------
        // * print the following pattern for n=5
        // * 1
        // * 1 2
        // * 1 2 3
        // * 1 2 3 4
        // * 1 2 3 4 5

        System.out.println("Problem 04 Solve");

        for (int r=1; r<=5; r++) {
            for (int c=1; c<=r; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        // * problem 5:
        // * --------------------------------
        // * print the following pattern for n=5
        // * a
        // * a b
        // * a b c
        // * a b c d
        // * a b c d e

        System.out.println("Problem 05 Solve");

        int decimalValue = 97; // ASCII value for 'a'
        char char_value;
        for (int r=1; r<=5; r++) {
            for (int c=1; c<=r; c++) {
                char_value = (char) (decimalValue + c - 1);
                System.out.print(char_value + " ");
            }
            System.out.println();
        }

        // * problem 6:
        // * --------------------------------
        // * print the following pattern for n=5
        // * 1 2 3 4 5
        // * 1 2 3 4
        // * 1 2 3
        // * 1 2
        // * 1

        System.out.println("Problem 06 Solve");

        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();

        // * problem 7:
        // * --------------------------------
        // * print the following pattern for n=5
        // * 1
        // * 2 3
        // * 4 5 6
        // * 7 8 9 10
        // * 11 12 13 14 15

        System.out.println("Problem 07 Solve");

        int cell_number = 1;
        for (int r=1; r<=5; r++) {
            for (int c=1; c<=r; c++) {
                System.out.print(cell_number++ + " ");
            }
            System.out.println();
        }

        // * problem 8:
        // * --------------------------------
        // * print the following pattern for n=5
        // * x       x
        // *   x   x  
        // *     x    
        // *   x   x  
        // * x       x

        System.out.println("Problem 08 Solve");

        int n = 9;
        for (int r=0; r<n; r++) {
            for (int c=0; c<n; c++) {
                if (r == c || r+c+1 == n) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}