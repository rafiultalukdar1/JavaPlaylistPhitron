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













    }
}